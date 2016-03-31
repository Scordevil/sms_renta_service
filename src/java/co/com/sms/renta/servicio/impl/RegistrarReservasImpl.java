/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.servicio.RegistrarReservas;
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
@Path("/registrarReservas")
public class RegistrarReservasImpl implements RegistrarReservas {

    @GET
    @Produces({"application/json"})
    public Reservacion_TO registrarReserva(@QueryParam("reserva_Lugar_Llegada") String reserva_Lugar_Llegada,
            @QueryParam("reserva_Lugar_Destino") String reserva_Lugar_Destino,
            @QueryParam("reserva_Notas") String reserva_Notas,
            @QueryParam("idCliente") int idCliente,
            @QueryParam("idCiudad_inicio") int idCiudad_inicio,
            @QueryParam("idCiudad_destino") int idCiudad_destino,
            @QueryParam("idEmpleado") int idEmpleado,
            @QueryParam("idVehiculo") int idVehiculo,
            @QueryParam("reserva_fechaInicio") String reserva_fechaInicio,
            @QueryParam("reserva_fechaLlegada") String reserva_fechaLlegada,
            @QueryParam("reserva_horaInicio") String reserva_horaInicio,
            @QueryParam("reserva_horaLlegada") String reserva_horaLlegada,
            @QueryParam("reservacion_Costo") int reservacion_Costo,
            @QueryParam("idCategoria_Servicio") int idCategoria_Servicio,
            @QueryParam("idServicio") int idServicio,
            @QueryParam("idEstado") int idEstado) throws Exception {

        Reservacion_TO reser = new Reservacion_TO(reserva_Lugar_Llegada, reserva_Lugar_Destino,
                reserva_Notas, idCliente, idCiudad_inicio, idCiudad_destino, idEmpleado, idVehiculo,
                reserva_fechaInicio, reserva_fechaLlegada, reserva_horaInicio, reserva_horaLlegada,
                reservacion_Costo, idCategoria_Servicio, idServicio, idEstado);

        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();

        return reservaDAO.registrarReserva(reser);

    }

}
