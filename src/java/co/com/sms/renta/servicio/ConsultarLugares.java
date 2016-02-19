/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Ciudad_TO;
import co.com.sms.renta.modelo.dto.Lugar_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarLugares {
    
    public List<Lugar_TO> consultarLugares(int idCiudad ) throws Exception;
    
}
