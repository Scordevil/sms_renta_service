/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Categoria_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Servicio_TO;
import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
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
    public int calcularCostoReserva(
            //  VARIABLES PARA RESERVACION
            @QueryParam("reserva_FechaInicio") String reserva_FechaInicio,
            @QueryParam("reserva_FechaLlegada") String reserva_FechaLlegada,
            @QueryParam("reserva_HoraInicio") String reserva_HoraInicio,
            @QueryParam("reserva_HoraLlegada") String reserva_HoraLlegada,
            //  VARIABLES PARA CATEGORIA
            @QueryParam("idCategoria") int idCategoria,
            //  VARIABLES PARA SERVICIOS
            @QueryParam("servicioDuracion") int servicioDuracion,
            @QueryParam("servicioNombre") String servicioNombre) throws Exception {
        
        int costo = 0;
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();
        
        
        Reservacion_TO reser = new Reservacion_TO(reserva_FechaInicio, reserva_FechaLlegada, reserva_HoraInicio, reserva_HoraLlegada);
        Categoria_TO cat = new Categoria_TO(idCategoria);
        Servicio_TO serv = new Servicio_TO(servicioNombre, servicioDuracion);
        
        costo = reservaDAO.calcularCostoReservacion(reser, serv, cat);

                
        return costo;
    }

}
