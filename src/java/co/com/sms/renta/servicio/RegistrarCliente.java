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
public interface RegistrarCliente {

    public Usuario_TO registrarClientes(String nombre, String cc, String email, int idCiudad,String usuario_pasaporte, String password, String remember_token,int idNacionalidad, int estadoUsuario, int rol) throws Exception;

}
