/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Usuario_TO;


/**
 *
 * @author SISTEMAS
 */
public interface EditarCliente {
    
    public Usuario_TO editarCliente (String nombre, String cc, String pasaporte, String telefono,
             int idUsuario) throws Exception;
        
}
