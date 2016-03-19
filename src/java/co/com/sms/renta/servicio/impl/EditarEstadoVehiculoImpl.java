/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.impl.VehiculoDAOImpl;
import co.com.sms.renta.servicio.EditarEstadoVehiculo;
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
@Path("/editarEstadoVehiculos")
public class EditarEstadoVehiculoImpl implements EditarEstadoVehiculo{

    @GET
    @Produces({"application/xml", "application/json"})
    public Vehiculo_TO editarEstadoVehiculo(@QueryParam("idEstado") int idEstado,
            @QueryParam("idVehiculo") int idVehiculo) throws Exception {
        
        Vehiculo_TO vehiculoEstado = new Vehiculo_TO(idVehiculo, "", idEstado);
        VehiculoDAOImpl veh = new VehiculoDAOImpl();
        return veh.editarEstadoVehiculo(vehiculoEstado);
        
    }
    
    
}
