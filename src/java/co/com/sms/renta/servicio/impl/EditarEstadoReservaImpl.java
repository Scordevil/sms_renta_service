/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import co.com.sms.renta.servicio.EditarEstadoReserva;
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
@Path("/editarEstadoReserva")
public class EditarEstadoReservaImpl implements EditarEstadoReserva {

    @GET
    @Produces({"application/json"})
    @Override
    public Reservacion_TO editarEstadoDeReserva(
            @QueryParam("idReservacion") int idReservacion,  
            @QueryParam("idEstado") int idEstado)  throws Exception {

        Reservacion_TO reservaFinal = new Reservacion_TO();


        ReservacionDAOImpl reservacionDAO = new ReservacionDAOImpl();
        reservaFinal = reservacionDAO.editarEstadoReserva(idReservacion, idEstado);

        return reservaFinal;
    }

}
