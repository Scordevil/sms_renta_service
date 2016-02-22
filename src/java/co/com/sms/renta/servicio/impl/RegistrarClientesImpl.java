/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.RegistrarCliente;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/registrarClientes")
public class RegistrarClientesImpl implements RegistrarCliente {

    
    @POST
    @Produces({"application/json", "application/xml"})    
    @Override
    public void registrarClientes(String nombre, String cc, String telefono, 
                String email, String razonSocial, String nit, int idCiudad, 
                String login, String password, String remember_token,
                int estadoUsuario, String foto_nombre, String foto_ruta, 
                int rol, String nombreRol, String mensaje) throws Exception {

        // instancia del Cliente con onstructor especifico para ingresar datos del cliente
        
        Usuario_TO cliente = new Usuario_TO(nombre, cc, telefono, email, 
                razonSocial, nit, idCiudad, login, password, remember_token, 
                estadoUsuario, foto_nombre, foto_ruta, rol);
        
        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        
        usuario.registrarClientes(cliente);
        
    }

    

}
