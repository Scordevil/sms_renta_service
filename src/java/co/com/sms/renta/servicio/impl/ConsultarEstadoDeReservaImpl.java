/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.impl.EstadoDAOImpl;
import co.com.sms.renta.servicio.ConsultarEstadoDeReserva;
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
@Path("/consultarEstadoDeReservacion")
public class ConsultarEstadoDeReservaImpl implements ConsultarEstadoDeReserva{

    @GET
    @Produces({"application/json"})
    public Estado_TO consultarEstadoDeReserva(@QueryParam("idReserva") int idReserva) throws Exception {
        
        Reservacion_TO reser = new Reservacion_TO(idReserva);
        Estado_TO estado = new Estado_TO();
        EstadoDAOImpl estadoDAO = new EstadoDAOImpl();
        
        estado = estadoDAO.consultarDatosEstadoReserva(reser);
        return estado;
    }
    
}
