/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.impl.Costos_ServiciosDAOImpl;
import co.com.sms.renta.servicio.CostosReservacion;
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
@Path("/costosReservacion")
public class CostosReservacionImpl implements CostosReservacion {

    @GET
    @Produces({"application/json"})
    public Costos_Servicios_TO calcularCostoReserva(
            //  VARIABLES PARA RESERVACION
            @QueryParam("reserva_FechaInicio") String reserva_FechaInicio,
            @QueryParam("reserva_FechaLlegada") String reserva_FechaLlegada,
            @QueryParam("reserva_HoraInicio") String reserva_HoraInicio,
            @QueryParam("reserva_HoraLlegada") String reserva_HoraLlegada,
            //  VARIABLES PARA CATEGORIA
            @QueryParam("idCategoria") int idCategoria,
            //  VARIABLES PARA SERVICIOS
            @QueryParam("idServicio") int idServicio) throws Exception {
        
       Costos_ServiciosDAOImpl CostoServicio = new Costos_ServiciosDAOImpl();
        
        
        Reservacion_TO reserva = new Reservacion_TO(reserva_FechaInicio, reserva_FechaLlegada, reserva_HoraInicio, reserva_HoraLlegada);
        Costos_Servicios_TO costosServicios = new Costos_Servicios_TO(idServicio,idCategoria);
        Costos_Servicios_TO costo = new Costos_Servicios_TO();
        
        System.out.print("Gustavo: "+reserva+"-"+costosServicios);
        
        costo = CostoServicio.consultarCostosServicio(costosServicios, reserva);
     
        return costo;
    }

}
