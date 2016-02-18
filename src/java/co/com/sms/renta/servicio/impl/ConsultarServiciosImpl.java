/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Servicio_TO;
import co.com.sms.renta.persistencia.dao.ServicioDAO;
import co.com.sms.renta.persistencia.dao.impl.ServicioDAOImpl;
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
@Path("/consultarServicios")
public class ConsultarServiciosImpl {
    
    @GET
    @Produces({"application/json", "application/xml"})
    public List<Servicio_TO> consultarServicios() throws Exception{
        
        List<Servicio_TO> servicios = new ArrayList<Servicio_TO>();
        ServicioDAOImpl servicio = new ServicioDAOImpl();
        
        servicios = servicio.consultarServicios();
        
        return servicios;
    }
    
}
