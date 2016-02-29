/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.ConsultarDatosSesionUsuario;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author SMS
 */
@Stateless
@Path("/consultarDatosSesion")
public class ConsultarDatosSesionUsuarioImpl implements ConsultarDatosSesionUsuario {

    @GET
    @Produces({"application/json"})

    @Override
    public Usuario_TO consultarDatosSesionUsuario(@QueryParam("login") String login, @QueryParam("password") String password ) throws Exception {
        
        Usuario_TO usuarioSesion = new Usuario_TO(); 
        UsuarioDAOImpl user = new UsuarioDAOImpl();
        
        Usuario_TO usuario = new Usuario_TO(login, password);

        usuarioSesion = user.consultarDatosSesionUsuario(usuario);

        return usuarioSesion;
    }
}
