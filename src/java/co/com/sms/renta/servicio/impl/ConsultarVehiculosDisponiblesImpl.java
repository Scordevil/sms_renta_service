/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.VehiculoDAO;
import co.com.sms.renta.persistencia.dao.impl.VehiculoDAOImpl;
import co.com.sms.renta.servicio.ConsultarVehiculosDisponibles;
import java.util.ArrayList;
import java.util.List;
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
@Path("/consultarVehiculosDisponibles")
public class ConsultarVehiculosDisponiblesImpl implements ConsultarVehiculosDisponibles{

    @GET
    @Produces({"application/json"})
    public List<Vehiculo_TO> consultarVehiculosDisponibles(@QueryParam("reserva_fechaInicio") String reserva_fechaInicio, 
                                                           @QueryParam("reserva_fechaLlegada") String reserva_fechaLlegada, 
                                                           @QueryParam("reserva_horaInicio") String reserva_horaInicio, 
                                                           @QueryParam("reserva_horaLlegada") String reserva_horaLlegada) throws Exception {
        
        Reservacion_TO reserva = new Reservacion_TO(reserva_fechaInicio,
                                     reserva_fechaLlegada, reserva_horaInicio, reserva_horaLlegada);
        
        VehiculoDAO vehiculos = new VehiculoDAOImpl();
        List<Vehiculo_TO> vehiculosDisponibles = new ArrayList<>();
        vehiculosDisponibles = vehiculos.consultarVehiculosDisponibles(reserva);
        
        
        return vehiculosDisponibles;
    }
    
    
    
}
