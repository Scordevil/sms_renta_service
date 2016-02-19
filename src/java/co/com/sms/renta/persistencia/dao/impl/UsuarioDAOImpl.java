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
import static java.lang.System.console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

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
        System.out.print("password: " + usuario.getPassword());

        // // //Seleccionar todos los registros
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_CC,u.Usuario_telefono, u.Usuario_email, "
                + " u.Usuario_razonSocial,u.Usuario_nit,c.Ciudad_nombre,u.Usuario_login,u.Usuario_password, "
                + "u.Usuario_remember_token,u.Usuario_EstadoUsuario,u.Usuario_foto_nombre,u.Usuario_foto_ruta, "
                + "r.Rol_nombre  "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c "
                + "where u.usuario_rol = r.idRol and "
                + "u.usuario_ciudad = c.idCiudad and "
                + "u.Usuario_login = 'administradorLogin' ";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        while (rs.next()) {
            user = new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
                    rs.getString(15));

        }

        if (!user.getLogin().equals("")) {//valida si el usuario existe en la BD

            if (user.getEstadoUsuario() == 1) {//Evalua el estado de la cuenta de usuario, si esta activa o inactiva
                if (!user.getPassword().equalsIgnoreCase("") && !user.getLogin().equalsIgnoreCase("")) {
//
                    if (user.getLogin().equalsIgnoreCase(usuario.getLogin()) && user.getPassword().equalsIgnoreCase(usuario.getPassword())) {
//
                        user.setMensaje("Usuario correcto");
                    } else {

                        user.setMensaje("Usuario o password incorrecto");
                    }
//
                } else {
                    user.setMensaje("Usuario no existe");
                }
            } else {
                user.setMensaje("Usuario inactivo");
            }

        } else {
            user.setMensaje("Usuario no existe");
        }
        return user;

    }

    /**
     *
     * METODOS PARA REGISTRAR USUARIOS
     *
     * @return @throws Exception
     */
    @Override
    public void registrarClientes(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {

            registrarTodosClientes(usuario);

        } catch (Exception e) {

            throw e;

        }

    }

    private void registrarTodosClientes(Usuario_TO usuario)
            throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "INSERT INTO `sms_usuario`(`Usuario_nombre`, `Usuario_CC`, "
                + "`Usuario_telefono`, `Usuario_email`, `Usuario_razonSocial`, "
                + "`Usuario_nit`, `Usuario_ciudad`, `Usuario_login`, `Usuario_password`, "
                + "`Usuario_remember_token`, `Usuario_EstadoUsuario`, `Usuario_foto_nombre`, "
                + "`Usuario_foto_ruta`, `Usuario_Rol`)"
                + " VALUES ('Johan' , "
                + "'1026276136', '2041556' , 'johanncanon@gmail.com' ,  'desarrollo web , '123135-51' "
                + ",1 , 'johanncanon' , '123456' , '123456' ,2 , 'hasd/sdf&as/es/fa', "
                + " 'lihsdf/kdsbg/lkajbt/cs' ,2)";

        st.executeQuery(sql);

    }

}
