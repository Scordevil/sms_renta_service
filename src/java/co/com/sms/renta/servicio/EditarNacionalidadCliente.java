/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Usuario_TO;

/**
 *
 * @author VaioDevelopment
 */
public interface EditarNacionalidadCliente {
    
            public Usuario_TO editarNacionalidadCliente (
             int idUsuario,int idNacionalidad) throws Exception;
    
}
