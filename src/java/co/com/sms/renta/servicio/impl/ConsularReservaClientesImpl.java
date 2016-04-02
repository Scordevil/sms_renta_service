/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.servicio.ConsularReservaClientes;
import java.util.ArrayList;
import java.util.List;
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
@Path("/consultarReservacionClientes")
public class ConsularReservaClientesImpl implements ConsularReservaClientes{

    @GET
    @Produces({"application/json"})
    public List<Reservacion_TO> reservasClientes(@QueryParam("idUsuario") int idUsuario) throws Exception {
        
        List<Reservacion_TO> reserCle = new ArrayList<>();
        Usuario_TO idCliente = new Usuario_TO(idUsuario);
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();
        
        reserCle = reservaDAO.consultarReservasClientes(idCliente);
                
        return reserCle;
    }
    
}
