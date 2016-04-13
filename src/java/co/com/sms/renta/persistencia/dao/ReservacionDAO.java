/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface ReservacionDAO {
    
    public Reservacion_TO registrarReserva (Reservacion_TO reserva) throws Exception;
    public Reservacion_TO eliminarReserva (Usuario_TO cliente, Reservacion_TO reserva) throws Exception;
    public List<Reservacion_TO> consultarReservasClientes (Usuario_TO cliente) throws Exception;
    public List<Reservacion_TO> consultarReservasConductor (Usuario_TO conductor) throws Exception;
    public Reservacion_TO consultarReservas (int idCliente, int idReservacion) throws Exception;
    public Reservacion_TO consultarReservasEmpleado (int idEmpleado, int idReservacion) throws Exception;
    public Reservacion_TO editarEstadoReserva ( int idCliente, int idReservacion, int idEstado) throws Exception;
    
 
}
