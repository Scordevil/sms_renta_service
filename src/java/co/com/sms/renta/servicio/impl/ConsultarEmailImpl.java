/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.ConsultarEmail;
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
@Path("/consultarEmail")
public class ConsultarEmailImpl implements ConsultarEmail {

    @GET
    @Produces({"application/json"})

    public Usuario_TO consultarEmail(@QueryParam("email") String email,
            @QueryParam("idUsuario") int idUsuario) throws Exception {

        Usuario_TO consultaEmail = new Usuario_TO(email, idUsuario);
        UsuarioDAOImpl DAO = new UsuarioDAOImpl();
        Usuario_TO user = new Usuario_TO();

        user = DAO.consulEmailUsuario(consultaEmail);

        return user; 
    }

}
