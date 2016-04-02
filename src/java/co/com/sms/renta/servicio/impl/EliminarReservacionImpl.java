/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.servicio.EliminarReservacion;
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
@Path("/eliminarReservacion")
public class EliminarReservacionImpl implements EliminarReservacion {

    @GET
    @Produces({"application/json"})
    public Reservacion_TO eliminarReservacionDeCliente(@QueryParam("idCliente") int idCliente,
                                   @QueryParam("idReservacion") int idReservacion) throws Exception {

//        MODELO PARA DEVOLVER LA INFO AL METODO "ELIMINAR RESERVACION"
        Reservacion_TO reser = new Reservacion_TO();

        Reservacion_TO reservaEliminada = new Reservacion_TO(idReservacion);
        Usuario_TO clienteId = new Usuario_TO(idCliente);
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();
        reser = reservaDAO.eliminarReserva(clienteId, reservaEliminada);
        
        return reser;
    }

}
