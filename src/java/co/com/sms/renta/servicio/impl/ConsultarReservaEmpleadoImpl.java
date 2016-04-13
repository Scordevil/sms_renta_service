/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import co.com.sms.renta.servicio.ConsultarReservaEmpleado;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author VaioDevelopment
 */
@Stateless
@Path("/consultarReservacionEmpleado")
public class ConsultarReservaEmpleadoImpl implements ConsultarReservaEmpleado {

    @GET
    @Produces({"application/json"})
    public Reservacion_TO reservasEmpleado(@QueryParam("idEmpleado") int idEmpleado, @QueryParam("idReserva") int idReserva) throws Exception {

        Reservacion_TO reserva = new Reservacion_TO();
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();

        reserva = reservaDAO.consultarReservasEmpleado(idEmpleado, idReserva);

        return reserva;
    }

}
