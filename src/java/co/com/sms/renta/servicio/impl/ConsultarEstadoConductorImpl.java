/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.ConsultarEstadoConductor;
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
@Path("/consultarEstadoConductor")
public class ConsultarEstadoConductorImpl implements ConsultarEstadoConductor{

    @GET
    @Produces({"application/json"})
    public Estado_TO consultarEstadoDelConductor(@QueryParam("idUsuario")int idUsuario) throws Exception {
        
        Usuario_TO conductor = new Usuario_TO(idUsuario);
        Estado_TO estadoFinal = new Estado_TO();
        UsuarioDAOImpl userDAO = new UsuarioDAOImpl();
        
        estadoFinal = userDAO.consultarEstdoUsuario(conductor);
        /*
        jfghghdfh
        */
        
        return estadoFinal;
    }
    
}
