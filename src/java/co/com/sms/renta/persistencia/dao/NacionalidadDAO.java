/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Nacionalidad_TO;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public interface NacionalidadDAO {
    
    public List<Nacionalidad_TO> consultarNacionalidades()throws Exception;
    
    
}
