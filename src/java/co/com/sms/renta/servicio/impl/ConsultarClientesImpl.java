/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SMS
 */
@Stateless
@Path("/consultarClientes")
public class ConsultarClientesImpl {
    @GET
    @Produces({"application/json"})
    public List<Usuario_TO> consultarClientes() throws Exception {
        
        List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        
        usuarios = usuario.consultarClientes();
        
        return usuarios;

    }
}
