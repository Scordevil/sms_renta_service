/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.impl.VehiculoDAOImpl;
import co.com.sms.renta.servicio.ConsultarVehiculos;
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
@Path("/consultarVehiculosDisponibles")
public class ConsultarVehiculosImpl implements ConsultarVehiculos{

    @GET
    @Produces({"application/json", "application/xml"})
    
    public List<Vehiculo_TO> consultarVehiculosDisponibles() throws Exception {
        
        List<Vehiculo_TO> vehiculosD = new ArrayList<Vehiculo_TO>();
        VehiculoDAOImpl vehiDAO = new VehiculoDAOImpl();
        
        vehiculosD = vehiDAO.consultarVehiculo();
        
        return vehiculosD;
    }
    
}
