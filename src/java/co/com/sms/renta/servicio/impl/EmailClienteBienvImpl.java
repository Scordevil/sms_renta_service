/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.config.SendEmail;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.servicio.EmailClienteBienv;
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
@Path("/enviarEmailClienteBienvenida")
public class EmailClienteBienvImpl implements EmailClienteBienv{

    @GET
    @Produces({"application/json"})
    public SendEmail emailClienteBienv(@QueryParam("email") String email, 
            @QueryParam("nombre")  String nombre, 
            @QueryParam("password") String password) throws Exception {
        
        Usuario_TO user = new Usuario_TO(nombre, email, password);
        SendEmail mail = new SendEmail();
        mail.sendEmailClienteRegistro(user);
        
        return mail;
    }
    
}
