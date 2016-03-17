/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
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
@Path("/consultarCliente")
public class ConsultarClienteImpl {
    
    @GET
    @Produces({"application/json"})
    public Usuario_TO consultarCliente( @QueryParam("idUsuario") int idUsuario) throws Exception {
        
        Usuario_TO usuarioN = new Usuario_TO();
        Usuario_TO cliente = new Usuario_TO(idUsuario);
        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        
        usuarioN = usuario.consultarCliente(cliente);
        
        return usuarioN;

    }
    
}
