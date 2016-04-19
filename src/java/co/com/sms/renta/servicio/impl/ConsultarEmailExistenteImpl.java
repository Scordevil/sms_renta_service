/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.ConsultarEmail;
import co.com.sms.renta.servicio.ConsultarEmailExistente;
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
@Path("/consultarEmailExistente")
public class ConsultarEmailExistenteImpl  implements ConsultarEmailExistente{

       @GET
    @Produces({"application/json"})

    public Usuario_TO consultarEmailExistente(@QueryParam("email") String email) throws Exception {

        Usuario_TO consultaEmail = new Usuario_TO(email, 0);
        UsuarioDAOImpl DAO = new UsuarioDAOImpl();
        Usuario_TO user = new Usuario_TO();

        user = DAO.consultarEmailExistente(consultaEmail);

        return user; 
    }

}
