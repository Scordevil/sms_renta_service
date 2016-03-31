/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Reservacion_TO;

/**
 *
 * @author SISTEMAS
 */
public interface RegistrarReservas {

    public Reservacion_TO registrarReserva(String reserva_Lugar_Llegada, String reserva_Lugar_Destino,
            String reserva_Notas, int idCliente, int idCiudad_inicio, int idCiudad_destino, int idEmpleado,
            int idVehiculo, String reserva_fechaInicio, String reserva_fechaLlegada, String reserva_horaInicio,
            String reserva_horaLlegada, int reservacion_Costo, int idCategoria_Servicio, int idServicio, int idEstado) throws Exception;

}
