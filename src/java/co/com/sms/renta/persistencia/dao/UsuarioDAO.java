/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import java.util.List;

/**
 * 
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad Usuario
 *
 * @author SMS
 */
public interface UsuarioDAO {
    
    public List<Usuario_TO> consultarEmpleados()throws Exception;
    
    public List<Usuario_TO> consultarProveedores()throws Exception;
    
    public List<Usuario_TO> consultarClientes()throws Exception;
    
}
