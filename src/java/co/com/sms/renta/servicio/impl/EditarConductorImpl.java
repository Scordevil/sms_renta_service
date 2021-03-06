/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.EditarConductor;
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
@Path("/editarConductores")
public class EditarConductorImpl implements EditarConductor{

    @GET
    @Produces({"application/xml", "application/json"})
    
    public Usuario_TO editarConductor(@QueryParam("nombre") String nombre,
            @QueryParam("cc") String cc,
            @QueryParam("pasaporte") String pasaporte,
            @QueryParam("telefono") String telefono,
            @QueryParam("email") String email,
            @QueryParam("idCiudad") int idCiudad,
            @QueryParam("password") String password,
            @QueryParam("remember_token") String remember_token,
            @QueryParam("estadoUsuario") int estadoUsuario,
            @QueryParam("foto_nombre") String foto_nombre,
            @QueryParam("foto_ruta") String foto_ruta,
            @QueryParam("rol") int rol,
            @QueryParam("idNacionalidad") int idNacionalidad,
            @QueryParam("hojaVida") String hojaVida,
            @QueryParam("idEstado") int idEstado,
            @QueryParam("idProveedor") int idProveedor,
            @QueryParam("hojaVida_ruta") String hojaVida_ruta,
            @QueryParam("idUsuario") int idUsuario) throws Exception {
        
        
        Usuario_TO conductor = new Usuario_TO(nombre, 
                cc, pasaporte, telefono, email, 
                idCiudad, password, remember_token, 
                estadoUsuario, foto_nombre, foto_ruta, 
                rol, idNacionalidad, hojaVida, 
                idEstado, idProveedor, hojaVida_ruta, 
                idUsuario);
        
        
//         Usuario_TO conductores = new Usuario_TO(nombre, cc, telefono, email, 
//               razonSocial, nit, nombre, login, password, remember_token, 
//               estadoUsuario, foto_nombre, foto_ruta, nombre, hojaVida, 
//               hojaVida_ruta, idUsuario);
       
//       Usuario_TO conductores = new Usuario_TO();
        
        UsuarioDAOImpl user = new UsuarioDAOImpl();
        
        return user.editarPerilConductor(conductor);
       
    }
    
}
