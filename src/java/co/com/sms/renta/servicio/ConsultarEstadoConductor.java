/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Estado_TO;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarEstadoConductor {
    public Estado_TO consultarEstadoDelConductor( int idUsuario )throws Exception;
    
    
    
}
