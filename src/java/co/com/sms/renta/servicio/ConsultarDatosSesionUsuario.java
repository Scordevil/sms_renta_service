/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Usuario_TO;

/**
 *
 * Interface del servicio de consulta de Admnistradores desde la Base de Datos
 * 
 * @author SMS
 */
public interface ConsultarDatosSesionUsuario {
    
     public Usuario_TO consultarDatosSesionUsuario(String email, String password) throws Exception;
}
