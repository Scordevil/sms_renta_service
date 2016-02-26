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
public interface EditarConductor {
    
    public Usuario_TO editarClinte (String nombre, String cc, String telefono,
            String email, String razonSocial, String nit, int idCiudad, String login, 
            String password, String remember_token,int estadoUsuario , String foto_nombre, String foto_ruta, 
            int rol, String hojaVida, String hojaVida_ruta, int idUsuario) throws Exception;
    
}
