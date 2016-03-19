/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Vehiculo_TO;

/**
 *
 * @author SISTEMAS
 */
public interface VehiculoDAO {
    
    public Vehiculo_TO editarEstadoVehiculo (Vehiculo_TO vehiculo) throws Exception;
    
}
