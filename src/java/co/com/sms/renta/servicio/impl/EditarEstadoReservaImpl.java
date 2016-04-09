/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
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
@Path("/editarEstadoResserva")
public class EditarEstadoReservaImpl implements EditarEstadoReserva {

    @GET
    @Produces({"application/json"})
    public Reservacion_TO editarEstadoReserva(@QueryParam("idEstado") int idEstado,
            @QueryParam("idUsuario") int idUsuario) throws Exception {

        Reservacion_TO reservaFinal = new Reservacion_TO();

        Reservacion_TO reser = new Reservacion_TO(idEstado);
        Usuario_TO conductor = new Usuario_TO(idUsuario);

        ReservacionDAOImpl reservacionDAO = new ReservacionDAOImpl();
        reservaFinal = reservacionDAO.editarEstadoReserva(reser, conductor);

        return reservaFinal;
    }

}
