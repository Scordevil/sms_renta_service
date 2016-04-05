/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarReservaConductor {
    public List<Reservacion_TO> consultarReservasCOnductores (int idEmpleado) throws Exception;
}
