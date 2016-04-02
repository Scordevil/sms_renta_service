/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.config;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author SISTEMAS
 */
public class SendEmail {

    private final Properties properties = new Properties();
    private Session session;

    SimpleDateFormat formatDate;
    SimpleDateFormat formatTime;

    private void init() {

        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", "587");
        properties.put("mail.smtp.user", "smsrenta@gmail.com");
        properties.put("mail.smtp.auth", "true");
        session = Session.getDefaultInstance(properties);
    }

    public SendEmail() {
    }

    public void sendEmailClienteRegistro(Usuario_TO cliente) {

        init();
        try {
            MimeMessage message = new MimeMessage(session);

            //quien envia
            message.setFrom(new InternetAddress("smsrenta@gmail.com"));

            // a donde se envia
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress("" + cliente.getEmail()));
            message.setSubject("Bienvenido a SMS Renta");
            message.setText("Señor(a) " + cliente.getNombre() + ","
                    + "\n"
                    + "Le confirmamos que su registro al sistema SMS Renta fue exitoso, y le damos la bienvenida a nuestra familia. \n"
                    + "Esperamos que nuestro servicio sea de su total agrado.\n"
                    + "Los datos de sesion para acceder al sistema son:.\n"
                    + "Nombre de sesion o email: " + cliente.getEmail() + "\n"
                    + "Contraseña: " + cliente.getPassword() + "\n"
                    + "Por favor no olvide editar su perfil para crear un nombre de sesion y contraseña personalizados.\n"
                    + "Atentamente, SMS Renta");

            Transport t = session.getTransport("smtp");
            t.connect("smtp.gmail.com", (String) properties.get("mail.smtp.user"), "Smsrenta2016");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        } catch (MessagingException me) {
            me.getMessage();
            //Aqui se deberia o mostrar un mensaje de error o en lugar
            //de no hacer nada con la excepcion, lanzarla para que el modulo
            //superior la capture y avise al usuario con un popup, por ejemplo.
            return;
        }

    }

//       ENVIO DE CORREO A CLIENTE DESPUES DE RESERVA
    public void sendEmailClienteReserva(Vehiculo_TO vehiculo, Reservacion_TO reservacion, Usuario_TO client) throws Exception{

        init();
        UsuarioDAOImpl usuDao = new UsuarioDAOImpl();
        Usuario_TO cliente = usuDao.consutarListaClientes(client);

        try {
            MimeMessage message = new MimeMessage(session);

            //quien envia
            message.setFrom(new InternetAddress("smsrenta@gmail.com"));

            // a donde se envia
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress("" + cliente.getEmail()));
            message.setSubject("SMSRenta informe de su reservacion");
            message.setText("Señor(a) " + cliente.getNombre() + ","
                    + "\n"
                    + "Le confirmamos su reserva para el vehículo " + vehiculo.getMarcaNombre() + " " + vehiculo.getReferencia_nombre() + " programada para el día " + reservacion.getReserva_fechaInicio() + " a las " + reservacion.getReserva_horaInicio() + " en " + reservacion.getReserva_Lugar_Llegada() + " en la ciudad de " + reservacion.getNombre_Ciudad_inicio() + " hasta el día " + reservacion.getReserva_fechaLlegada() + ". "
                    + "Allí lo atenderá un asesor de SMSRenta, quien le entregara su vehiculo y le indicara todo lo relacionado al dia y hora de entrega.\n"
                    + "El Valor de su servicio es de COP $" + reservacion.getReservacion_Costo() + ", la factura será enviada a su correo electrónico en dos días.\n"
                    + "Esperamos que nuestro servicio sea de su total satisfacción y no olvide calificarlo."
                    + "Atentamente,\n"
                    + "SMS Renta");

            Transport t = session.getTransport("smtp");
            t.connect("smtp.gmail.com", (String) properties.get("mail.smtp.user"), "Smsrenta2016");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        } catch (MessagingException me) {
            me.getMessage();
            //Aqui se deberia o mostrar un mensaje de error o en lugar
            //de no hacer nada con la excepcion, lanzarla para que el modulo
            //superior la capture y avise al usuario con un popup, por ejemplo.
            return;
        }
    }

}
