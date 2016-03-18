/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.EditarPasswordCliente;
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
@Path("/editarPasswordCliente")
public class EditarPasswordClienteImpl implements EditarPasswordCliente{
    
    
    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO editarPasswordCliente(
             @QueryParam("idUsuario") int idUsuario, @QueryParam("password") String password,@QueryParam("rPassword") String rPassword) throws Exception {
        
        Usuario_TO cliente = new Usuario_TO(idUsuario, password,rPassword);

        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        Usuario_TO user = new Usuario_TO();
        
        user = usuario.editarPasswordCliente(cliente);

        return user;
    }
    
}
