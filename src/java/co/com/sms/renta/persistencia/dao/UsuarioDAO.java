/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Usuario
 *
 * @author SMS
 */
public interface UsuarioDAO {

    public List<Usuario_TO> consultarProveedores() throws Exception;

    public List<Usuario_TO> consultarAdministradores() throws Exception;

    public Usuario_TO consultarDatosSesionUsuario(Usuario_TO usuario) throws Exception;

//    METODO DE CONSULTA DE NOMBRE DE USUARIO MEDIANTE EL EMAIL REGISTRADO
    public Usuario_TO consulEmailUsuario(Usuario_TO usuario) throws Exception;

    /*
     *
     *Metodos del CRUD usuario CLiente
     *
     */
    public List<Usuario_TO> consultarClientes() throws Exception;

    public Usuario_TO consultarCliente(Usuario_TO cliente) throws Exception;

    public Usuario_TO registrarClientes(Usuario_TO usuario) throws Exception;

    public Usuario_TO editarDatosCliente(Usuario_TO usuario) throws Exception;

    public Usuario_TO editarNacionalidadCliente(Usuario_TO usuario) throws Exception;

    public Usuario_TO editarLocalidadCliente(Usuario_TO usuario) throws Exception;

    public Usuario_TO editarPasswordCliente(Usuario_TO usuario) throws Exception;

    /*
     *
     *Metodos del CRUD usuario CONDUCTOR
     *
     */
    public Usuario_TO editarPerilConductor(Usuario_TO usuario) throws Exception;

    public List<Usuario_TO> consultarEmpleados() throws Exception;

    public Usuario_TO editarEstadoConductor(Usuario_TO usuario) throws Exception;

    /*
     *
     *Metodos del CRUD usuario PROVEEDOR
     *
     */
    public Usuario_TO consutarListaClientes(Usuario_TO usuario) throws Exception;

    public Usuario_TO consutarListaConductores(Usuario_TO usuario) throws Exception;

    public Estado_TO consultarEstdoUsuario(Usuario_TO usuario) throws Exception;
    
    public Usuario_TO consultarIdEmpleado(Usuario_TO idEmpleado) throws Exception;
}
