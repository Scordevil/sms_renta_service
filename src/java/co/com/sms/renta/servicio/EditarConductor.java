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

    public Usuario_TO editarConductor(String nombre,
            String cc,
            String pasaporte,
            String telefono,
            String email,
            int idCiudad,
            String password,
            String remember_token,
            int estadoUsuario,
            String foto_nombre,
            String foto_ruta,
            int rol,
            int idNacionalidad ,
            String hojaVida,
            int idEstado,
            int idProveedor,
            String hojaVida_ruta,
            int idUsuario) throws Exception;

}
