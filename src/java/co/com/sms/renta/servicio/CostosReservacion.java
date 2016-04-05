/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

/**
 *
 * @author SISTEMAS
 */
public interface CostosReservacion {
    
    public int calcularCostoReserva(
//            VARIABLES PARA RESERVACION
            String reserva_FechaInicio,
            String reserva_FechaLlegada,
            String reserva_HoraInicio,
            String reserva_HoraLlegada,
//            VARIABLES PARA CATEGORIA
            int idCategoria,
//            VARIABLES PARA SERVICIOS
            int servicioDuracion,
            String servicioNombre  ) throws Exception;
    
}
