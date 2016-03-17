/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.config.Config;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SMS
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Usuario_TO> consultarEmpleados() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {

            usuarios = consultarTodosEmpleados();

        } catch (Exception e) {

            throw e;

        }

        return usuarios;
    }

    private List<Usuario_TO> consultarTodosEmpleados() throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_CC,u.Usuario_telefono, u.Usuario_email, "
                + "u.Usuario_razonSocial,u.Usuario_nit,c.Ciudad_nombre,u.Usuario_login,u.Usuario_password, "
                + "u.Usuario_remember_token,u.Usuario_EstadoUsuario,u.Usuario_foto_nombre,u.Usuario_foto_ruta, "
                + "r.Rol_nombre , h.hojavida_nombre, h.hojavida_ruta "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c, sms_empleado as e, sms_hojavida as h "
                + "where u.usuario_rol = r.idRol and "
                + "u.usuario_ciudad = c.idCiudad and "
                + "u.idUsuario = e.empleado_idUsuario and "
                + "h.idHojaVida = e.empleado_hojaVida";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        while (rs.next()) {

            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                    rs.getString(15), rs.getString(16), rs.getString(17)));

        }

        return usuarios;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Usuario_TO> consultarClientes() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {

            usuarios = consultarTodosClientes();

        } catch (Exception e) {

            throw e;

        }

        return usuarios;
    }

    private List<Usuario_TO> consultarTodosClientes() throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_CC, u.Usuario_telefono, u.Usuario_email, "
                + "u.Usuario_razonSocial, u.Usuario_nit,c.Ciudad_nombre, u.Usuario_login, u.Usuario_password, "
                + "u.Usuario_remember_token, u.Usuario_EstadoUsuario, u.Usuario_foto_nombre,u.Usuario_foto_ruta, "
                + "r.Rol_nombre "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c "
                + "where u.usuario_rol = r.idRol and "
                + "u.usuario_ciudad = c.idCiudad and "
                + "r.Rol_nombre = 'Cliente'";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        while (rs.next()) {

            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                    rs.getString(15)));

        }

        return usuarios;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO consultarCliente(Usuario_TO cliente) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO usuario = new Usuario_TO();

        try {

            usuario = consultaDeCliente(cliente);

        } catch (Exception e) {

            throw e;

        }

        return usuario;
    }

    private Usuario_TO consultaDeCliente(Usuario_TO cliente) throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_email,  "
                + " u.idCiudad, u.Usuario_pasaporte, u.Usuario_password, "
                + "u.Usuario_remember_token,u.idNacionalidad, u.Usuario_EstadoUsuario,  "
                + "u.idRol  "
                + "from sms_usuario as u  "
                + "where "
                + "u.`idUsuario` = '" + cliente.getIdUsuario()+ "';";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        Usuario_TO usuario = new Usuario_TO();

        while (rs.next()) {

             usuario = new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));

        }

        return usuario;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Usuario_TO> consultarProveedores() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {

            usuarios = consultarTodosProveedores();

        } catch (Exception e) {

            throw e;

        }

        return usuarios;
    }

    private List<Usuario_TO> consultarTodosProveedores() throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_CC,u.Usuario_telefono, u.Usuario_email, "
                + "u.Usuario_razonSocial,u.Usuario_nit,c.Ciudad_nombre,u.Usuario_login,u.Usuario_password, "
                + "u.Usuario_remember_token,u.Usuario_EstadoUsuario,u.Usuario_foto_nombre,u.Usuario_foto_ruta, "
                + "r.Rol_nombre "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c, sms_proveedor as p "
                + "where u.usuario_rol = r.idRol and "
                + "u.usuario_ciudad = c.idCiudad and "
                + "r.idRol = p.Proveedor_idUsuario";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        while (rs.next()) {

            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                    rs.getString(15)));

        }

        return usuarios;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Usuario_TO> consultarAdministradores() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {

            usuarios = consultarTodosAdministradores();

        } catch (Exception e) {

            throw e;

        }

        return usuarios;
    }

    private List<Usuario_TO> consultarTodosAdministradores() throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre, u.Usuario_CC, u.Usuario_telefono, u.Usuario_email, "
                + " u.Usuario_razonSocial, u.Usuario_nit, c.Ciudad_nombre, u.Usuario_login, u.Usuario_password, "
                + " u.Usuario_remember_token, u.Usuario_EstadoUsuario, u.Usuario_foto_nombre, u.Usuario_foto_ruta, "
                + " r.Rol_nombre "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c "
                + "where r.Rol_nombre = 'Administrador Principal' or "
                + "r.Rol_nombre = 'Administrador Secundario'";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        while (rs.next()) {

            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                    rs.getString(15)));

        }

        return usuarios;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO consultarDatosSesionUsuario(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = consultarDatosDeSesionUsuario(usuario);

        } catch (Exception e) {

            throw e;

        }

        return user;
    }

    private Usuario_TO consultarDatosDeSesionUsuario(Usuario_TO usuario) throws SQLException {

        Config md5 = new Config();
        Usuario_TO user = new Usuario_TO();

        usuario.setPassword(md5.getMD5(usuario.getPassword()));

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_email,  "
                + " u.idCiudad, u.Usuario_pasaporte, u.Usuario_password, "
                + "u.Usuario_remember_token,u.idNacionalidad, u.Usuario_EstadoUsuario,  "
                + "u.idRol  "
                + "from sms_usuario as u  "
                + "where "
                + "u.`Usuario_email` = '" + usuario.getEmail() + "';";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        while (rs.next()) {
            user = new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));

        }

        System.out.print(user + "------------------------------");

        if (!user.getEmail().equals("")) {//valida si el usuario existe en la BD

            if (user.getEstadoUsuario() == 1) {//Evalua el estado de la cuenta de usuario, si esta activa o inactiva
                if (!user.getPassword().equalsIgnoreCase("") && !user.getEmail().equalsIgnoreCase("")) {
//
                    if (user.getEmail().equalsIgnoreCase(usuario.getEmail()) && user.getPassword().equalsIgnoreCase(usuario.getPassword())) {
//
                        user.setMensaje("Usuario correcto");
                    } else {
                        user = new Usuario_TO();
                        user.setMensaje("Usuario o password incorrecto");
                    }
//
                } else {
                    user = new Usuario_TO();
                    user.setMensaje("Usuario no existe");
                }
            } else {
                user = new Usuario_TO();
                user.setMensaje("Usuario inactivo");
            }

        } else {
            user = new Usuario_TO();
            user.setMensaje("Usuario no existe");
        }
        return user;

    }

    /**
     *
     * METODOS PARA REGISTRAR CLIENTES
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO registrarClientes(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = registrarTodosClientes(usuario);

        } catch (Exception e) {

            throw e;

        }

        return user;

    }

    private Usuario_TO registrarTodosClientes(Usuario_TO usuario)
            throws SQLException {

        Usuario_TO user = new Usuario_TO();

        Config md5 = new Config();

        usuario.setRemember_token(md5.getMD5(usuario.getRemember_token()));
        usuario.setPassword(md5.getMD5(usuario.getPassword()));

        try {
//
            String sql = "INSERT INTO `sms_usuario` (`Usuario_nombre`, `Usuario_email`, `idCiudad`,`Usuario_pasaporte`,  `Usuario_password`, `Usuario_remember_token`, `Usuario_EstadoUsuario`, `idRol`,`idNacionalidad`) VALUES ( '"
                    + usuario.getNombre() + "', '"
                    + usuario.getEmail() + "', "
                    + usuario.getIdCiudad() + ", '"
                    + usuario.getPasaporte() + "', '"
                    + usuario.getPassword() + "',' "
                    + usuario.getRemember_token() + "'," + 1 + "," + 3 + ",  "
                    + usuario.getIdNacionalidad() + ");";

            st.execute(sql);

            // LLAMA AL MÉTODO
            user.setMensaje("Usuario registrado correctamente");

        } catch (Exception e) {
            user = new Usuario_TO();
            user.setMensaje("Usuario no registrado");
            throw e;

        }

        return user;

    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO editarDatosCliente(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = editarDatosClientes(usuario);

        } catch (Exception e) {

            throw e;

        }
        return user;
    }

    private Usuario_TO editarDatosClientes(Usuario_TO usuario) throws SQLException {

        Usuario_TO user = new Usuario_TO();

        try {
//
            String sql = "UPDATE `sms_usuario`  "
                    + "SET `Usuario_nombre`='" + usuario.getNombre() + "',`Usuario_CC`='" + usuario.getCC() + "' , `Usuario_telefono`= '" + usuario.getTelefono() + "' , "
                    + "  WHERE `sms_usuario`.`idUsuario` = " + usuario.getIdUsuario() + " ;";

            st.executeUpdate(sql.toString());

            // LLAMA AL MÉTODO
            user.setMensaje("Usuario editado correctamente");

        } catch (Exception e) {
            user = new Usuario_TO();
            user.setMensaje("Usuario no Editado");
            throw e;

        }

        return user;

    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO editarPerilConductor(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = editarTodosConductores(usuario);

        } catch (Exception e) {

            throw e;

        }
        return user;
    }

    private Usuario_TO editarTodosConductores(Usuario_TO usuario) throws SQLException {

        Usuario_TO user = new Usuario_TO();

        try {
//
            String sql = "UPDATE `sms_usuario` "
                    + "     inner join `sms_rol` on sms_usuario.Usuario_Rol = sms_rol.idRol "
                    + "     inner join `sms_ciudad`  on sms_usuario.Usuario_ciudad = sms_ciudad.idCiudad  "
                    + "     inner join `sms_empleado` on sms_usuario.idUsuario = sms_empleado.empleado_idUsuario "
                    + "     inner join `sms_hojavida` on sms_hojavida.idHojaVida = sms_empleado.empleado_hojaVida "
                    + " SET `Usuario_nombre`= '" + usuario.getNombre() + "' , "
                    + " `Usuario_email`= ' " + usuario.getEmail() + " ' ,`Usuario_razonSocial`='" + usuario.getRazonSocial() + "',`Usuario_nit`='" + usuario.getNit() + "' , "
                    + " `Usuario_ciudad`= " + usuario.getIdCiudad() + " ,`Usuario_login`='" + usuario.getLogin() + "' ,`Usuario_password`='" + usuario.getPassword() + "', "
                    + " `Usuario_remember_token`='" + usuario.getRemember_token() + "',`Usuario_EstadoUsuario`= " + usuario.getEstadoUsuario() + " ,`Usuario_foto_nombre`='" + usuario.getFoto_nombre() + "' , "
                    + " `Usuario_foto_ruta`='" + usuario.getFoto_ruta() + "',`Usuario_Rol`='" + usuario.getRol() + "' , "
                    + " `HojaVida_nombre`= '" + usuario.getHojaVida() + "' , `HojaVida_ruta`= '" + usuario.getHojaVidaRuta() + "'  "
                    + "  WHERE `idUsuario` = " + usuario.getIdUsuario() + " ;";

            st.executeUpdate(sql);

            // LLAMA AL MÉTODO
            user.setMensaje("Usuario registrado correctamente");

        } catch (Exception e) {
            user = new Usuario_TO();
            user.setMensaje("Usuario no registrado");
            throw e;

        }

        return user;

    }

}
