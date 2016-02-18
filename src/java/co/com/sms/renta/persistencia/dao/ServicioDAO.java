/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Servicio_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad Servicios
 * 
 * @author SISTEMAS
 */
public interface ServicioDAO {
    
    public List<Servicio_TO> consultarServicios() throws Exception;
    
}
