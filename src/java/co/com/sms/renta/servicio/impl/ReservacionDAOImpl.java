/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.ReservacionDAO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SISTEMAS
 */
public class ReservacionDAOImpl implements ReservacionDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Reservacion_TO registrarReserva(Reservacion_TO reserva) throws Exception {

        Reservacion_TO reser = new Reservacion_TO();
        try {
            reser = todasLasReservaciones(reserva);

        } catch (Exception e) {
            throw e;
        }

        return reser;
    }

    public Reservacion_TO todasLasReservaciones(Reservacion_TO reservas) throws SQLException {

        Reservacion_TO reser = new Reservacion_TO();

        try {
            String sql = "INSERT INTO `sms_reservacion` ( `Reservacion_lugar_llegada`, `Reservacion_lugar_destino`, "
                    + "`idCliente`, `idCiudad_inicio`, `idVehiculo`, `Reservacion_fechaInicio`, `Reservacion_fechaLlegada`,  "
                    + "`Reservacion_horaInicio`,`Reservacion_horaLlegada`,`Reservacion_Costo`,`idCategoria_Servicio`,`idServicio`,`idEstado`) "
                    + " VALUES ('" + reservas.getReserva_Lugar_Llegada() + "', '" + reservas.getReserva_Lugar_Destino() + "' , " + reservas.getIdCliente() + " , "
                    + reservas.getIdCiudad_inicio() + " , " + reservas.getIdVehiculo() + " , '" + reservas.getReserva_fechaInicio() + "' , "
                    + " '" + reservas.getReserva_fechaLlegada() + "',  '" + reservas.getReserva_horaInicio() + "', '" + reservas.getReserva_horaLlegada() + "', "
                    + reservas.getReservacion_Costo() + " , " + reservas.getIdCategoria_Servicio() + " , " + reservas.getIdServicio() + " , " + reservas.getIdEstado() + " )";

            st.execute(sql);
            reser.setMensaje("RESERVA REGISTRADA CORRECTAMENTE");

        } catch (Exception e) {
            Reservacion_TO resera = new Reservacion_TO();
            resera.setMensaje("Reserva no registrada");
            throw e;
        }
        return reser;
    }

}
