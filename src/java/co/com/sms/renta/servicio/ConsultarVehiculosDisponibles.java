/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarVehiculosDisponibles {
    public List<Vehiculo_TO> consultarVehiculosDisponibles()
}
