/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import java.util.ArrayList;
import java.util.List;
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
@Path("/consultarReservacion")
public class ConsultarReservaImpl {

    @GET
    @Produces({"application/json"})
    public Reservacion_TO reservas(@QueryParam("idUsuario") int idUsuario, @QueryParam("idReserva") int idReserva) throws Exception {

        Reservacion_TO reserva = new Reservacion_TO();
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();

        reserva = reservaDAO.consultarReservas(idUsuario,idReserva );

        return reserva;
    }

}
