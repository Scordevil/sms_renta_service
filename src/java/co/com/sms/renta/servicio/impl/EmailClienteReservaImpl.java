/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.config.SendEmail;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.servicio.EmailClientelReserva;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/enviarEmailClienteReservacion")
public class EmailClienteReservaImpl implements EmailClientelReserva {

    @GET
    @Produces({"application/json"})
    public SendEmail envioEmailClienteReserva(@QueryParam("usuarioEmail") String usuarioEmail,
            @QueryParam("usuarioNombre") String usuarioNombre,
            @QueryParam("marcaNombre") String marcaNombre,
            @QueryParam("referenciaNombre") String referenciaNombre,
            @QueryParam("reserva_Lugar_Inicio") String reserva_Lugar_Inicio,
            @QueryParam("reserva_Lugar_Destino") String reserva_Lugar_Destino,
            @QueryParam("reserva_Fecha_Inicio") String reserva_Fecha_Inicio,
            @QueryParam("reserva_Hora_Inicio") String reserva_Hora_Inicio,
            @QueryParam("nombre_Ciudad_Inicio") String nombre_Ciudad_Inicio,
            @QueryParam("reserva_Costo") int reserva_Costo) throws Exception {

        Usuario_TO user = new Usuario_TO(usuarioNombre, usuarioEmail, 0);
        Vehiculo_TO vehi = new Vehiculo_TO(referenciaNombre, marcaNombre);
        Reservacion_TO reserva = new Reservacion_TO(reserva_Lugar_Inicio,
                reserva_Lugar_Destino,
                nombre_Ciudad_Inicio,
                reserva_Fecha_Inicio,
                reserva_Hora_Inicio,
                reserva_Costo);

        SendEmail envioEmail = new SendEmail();

        envioEmail.sendEmailClienteReserva(vehi, reserva, user);
        return envioEmail;
    }

}
