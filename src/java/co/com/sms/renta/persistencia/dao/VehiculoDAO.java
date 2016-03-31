/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface VehiculoDAO {
    
    public Vehiculo_TO editarEstadoVehiculo (Vehiculo_TO vehiculo) throws Exception;
    
    public List<Vehiculo_TO> consultarVehiculo () throws Exception;
    public List<Vehiculo_TO> consultarVehiculosDisponibles (Reservacion_TO reservacion) throws Exception;
    
}
