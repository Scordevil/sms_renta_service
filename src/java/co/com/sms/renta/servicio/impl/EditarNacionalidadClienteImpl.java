/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.EditarNacionalidadCliente;
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
@Path("/editarNacionalidadClientes")
public class EditarNacionalidadClienteImpl implements EditarNacionalidadCliente{
    
    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO editarNacionalidadCliente(
             @QueryParam("idUsuario") int idUsuario, @QueryParam("idNacionalidad") int idNacionalidad) throws Exception {
        
        Usuario_TO cliente = new Usuario_TO(idUsuario, idNacionalidad);

        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        Usuario_TO user = new Usuario_TO();
        
        user = usuario.editarNacionalidadCliente(cliente);

        return user;
    }
    
}
