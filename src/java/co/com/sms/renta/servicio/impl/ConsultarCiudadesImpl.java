/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Ciudad_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.CiudadDAOImpl;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/consultarCiudades")
public class ConsultarCiudadesImpl {
    
    
    @GET
    @Produces({"application/json"})
    public List<Ciudad_TO> consultarCiudades()throws Exception{
        
         List<Ciudad_TO> ciudades = new ArrayList<Ciudad_TO>();
        CiudadDAOImpl ciudad = new CiudadDAOImpl();
        
        ciudades = ciudad.consultarCiudades();
        
        return ciudades;

    }
    
}
