/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface RegistrarCliente {
    
    public void registrarClientes(Usuario_TO usuario) throws Exception;
    
}
