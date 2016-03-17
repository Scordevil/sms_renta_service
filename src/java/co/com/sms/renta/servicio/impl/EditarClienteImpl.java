/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.EditarCliente;
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
@Path("/editarDatosClientes")
public class EditarClienteImpl implements EditarCliente{

    @GET
    @Produces({"application/json"})
    
    public Usuario_TO editarCliente(@QueryParam("nombre") String nombre,
            @QueryParam("cc") String cc,
            @QueryParam("telefono") String telefono,
            @QueryParam("idUsuario") int idUsuario) throws Exception {
        
        Usuario_TO cliente = new Usuario_TO(idUsuario,nombre, cc, telefono);

        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        Usuario_TO user = new Usuario_TO();
        
        user = usuario.editarDatosCliente(cliente);

        return user;
    }

    
    
}
