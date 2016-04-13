/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.config.Config;
import co.com.sms.renta.modelo.dto.Estado_TO;
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
        String sql = "SELECT u.idUsuario, u.Usuario_nombre, u.Usuario_CC, u.Usuario_pasaporte , u.Usuario_telefono, u.Usuario_email, "
                + " c.Ciudad_nombre, u.Usuario_password, u.Usuario_remember_token, u.Usuario_EstadoUsuario, "
                + " u.Usuario_foto_nombre, u.Usuario_foto_ruta, r.Rol_nombre , "
                + " u.idNacionalidad, h.hojavida_nombre,e.idEstado, e.idProveedor , h.hojavida_ruta  "
                + "from sms_usuario as u , sms_rol as r, sms_ciudad as c, sms_empleado as e, sms_hojavida as h "
                + "where u.idRol = r.idRol and "
                + " u.idCiudad = c.idCiudad and "
                + " u.idUsuario = e.idUsuario and "
                + " h.idHojaVida = e.idhojaVida";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        while (rs.next()) {

            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
                    rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14),
                    rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getString(18)));
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

//            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
//                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
//                    rs.getString(15)));
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
        String sql = "SELECT u.idUsuario, u.Usuario_nombre,u.Usuario_CC, u.Usuario_telefono, u.Usuario_email,  "
                + " u.idCiudad, u.Usuario_pasaporte, u.Usuario_password, "
                + "u.Usuario_remember_token, u.Usuario_EstadoUsuario, u.idRol , u.idNacionalidad  "
                + "from sms_usuario as u  "
                + "where "
                + "u.`idUsuario` = '" + cliente.getIdUsuario() + "';";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        Usuario_TO usuario = new Usuario_TO();

        while (rs.next()) {

            usuario = new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11), rs.getInt(12));

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

//            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
//                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
//                    rs.getString(15)));
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

//            usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
//                    rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14),
//                    rs.getString(15)));
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
        int registro = 0;

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

            registro = registro + 1;
        }

        System.out.print(user + "------------------------------");

        if (registro > 0) {

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
                    System.out.println("inactivo");
                    user = new Usuario_TO();
                    user.setMensaje("Usuario inactivo");
                }

            } else {

                user = new Usuario_TO();
                user.setMensaje("Usuario no existe");
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
                    + "SET `Usuario_nombre`='" + usuario.getNombre() + "',`Usuario_CC`='" + usuario.getCC() + "' ,`Usuario_pasaporte`='" + usuario.getPasaporte() + "' , `Usuario_telefono`= '" + usuario.getTelefono() + "'  "
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
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO editarNacionalidadCliente(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = editarLaNacionalidad(usuario);
        } catch (Exception e) {
            throw e;
        }

        return user;
    }

    private Usuario_TO editarLaNacionalidad(Usuario_TO usuario) throws SQLException {

        try {
//
            String sql = "UPDATE `sms_usuario`  "
                    + "SET `idNacionalidad`='" + usuario.getIdNacionalidad() + "'  "
                    + "  WHERE `sms_usuario`.`idUsuario` = " + usuario.getIdUsuario() + " ;";

            st.execute(sql);

            // LLAMA AL MÉTODO
            usuario.setMensaje("Usuario editado correctamente");

        } catch (Exception e) {
            usuario = new Usuario_TO();
            usuario.setMensaje("Usuario no editado");
            throw e;

        }

        return usuario;
    }

    /**
     *
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO editarLocalidadCliente(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = editarLaLocalidad(usuario);
        } catch (Exception e) {
            throw e;
        }

        return user;
    }

    private Usuario_TO editarLaLocalidad(Usuario_TO usuario) throws SQLException {

        try {
//

            String sql = "UPDATE `sms_usuario`  "
                    + "SET `idCiudad`='" + usuario.getIdCiudad() + "'  "
                    + "  WHERE `sms_usuario`.`idUsuario` = " + usuario.getIdUsuario() + " ;";

            st.execute(sql);

            // LLAMA AL MÉTODO
            usuario.setMensaje("Usuario editado correctamente");

        } catch (Exception e) {
            usuario = new Usuario_TO();
            usuario.setMensaje("Usuario no editado");
            throw e;

        }

        return usuario;
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO editarPasswordCliente(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = editarPasswordClientes(usuario);

        } catch (Exception e) {

            throw e;

        }
        return user;
    }

    private Usuario_TO editarPasswordClientes(Usuario_TO usuario) throws SQLException {

        Usuario_TO user = new Usuario_TO();

        Config md5 = new Config();

        usuario.setRemember_token(md5.getMD5(usuario.getRemember_token()));
        usuario.setPassword(md5.getMD5(usuario.getPassword()));

        try {
//
            String sql = "UPDATE `sms_usuario`  "
                    + "SET `Usuario_password`='" + usuario.getPassword() + "',`Usuario_remember_token`='" + usuario.getRemember_token() + "'  "
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

            String sql = "UPDATE `sms_usuario` "
                    + "     inner join `sms_empleado` on sms_empleado.idUsuario = sms_usuario.idUsuario  "
                    + "     inner join `sms_hojavida` on sms_hojavida.idHojaVida = sms_empleado.idhojaVida "
                    + " SET `Usuario_nombre`= '" + usuario.getNombre() + "' , "
                    + " `Usuario_CC`='" + usuario.getCC() + "' , "
                    + " `Usuario_pasaporte`='" + usuario.getPasaporte() + "' , "
                    + " `Usuario_telefono`='" + usuario.getTelefono() + "' , "
                    + " `Usuario_email`= ' " + usuario.getEmail() + " ' , "
                    + "  sms_usuario.idCiudad = " + usuario.getIdCiudad() + " , "
                    + " `Usuario_password`='" + usuario.getPassword() + "' , "
                    + " `Usuario_remember_token`='" + usuario.getRemember_token() + "' , "
                    + " `Usuario_EstadoUsuario`= " + usuario.getEstadoUsuario() + " , "
                    + " `Usuario_foto_nombre`='" + usuario.getFoto_nombre() + "' , "
                    + " `Usuario_foto_ruta`='" + usuario.getFoto_ruta() + "' , "
                    + "  sms_usuario.idRol =" + usuario.getRol() + " , "
                    + " `idNacionalidad`=" + usuario.getIdNacionalidad() + " , "
                    + " `HojaVida_nombre`= '" + usuario.getHojaVida() + "' , "
                    + " `HojaVida_ruta`= '" + usuario.getHojaVidaRuta() + "' , "
                    + "  sms_empleado.idEstado = " + usuario.getIdEstado() + " , "
                    + "  sms_empleado.idProveedor = " + usuario.getIdProveedor() + "  "
                    + "  WHERE sms_usuario.idUsuario = " + usuario.getIdUsuario() + " ;";

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

    @Override
    public Usuario_TO editarEstadoConductor(Usuario_TO usuario) throws Exception {

        Usuario_TO user = new Usuario_TO();

        try {

            String sql = "UPDATE `sms_usuario` "
                    + "     inner join `sms_empleado` on sms_usuario.idUsuario  = sms_empleado.idUsuario "
                    + "  SET sms_empleado.idEstado = " + usuario.getIdEstado() + "  "
                    + "  WHERE sms_usuario.idUsuario = " + usuario.getIdUsuario() + " ;";

            st.executeUpdate(sql);

            // LLAMA AL MÉTODO
            user.setMensaje("Usuario Editado correctamente");

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
    public Usuario_TO consulEmailUsuario(Usuario_TO usuario) throws Exception {

        Statement st = ConexionSQL.conexion();
        Usuario_TO user = new Usuario_TO();

        try {

            user = consultarEmailDeUsuario(usuario);

        } catch (Exception e) {

            throw e;

        }

        return user;
    }

    private Usuario_TO consultarEmailDeUsuario(Usuario_TO usuario) throws SQLException {

        Usuario_TO user = new Usuario_TO();
        int registro = 0;

        // // //Seleccionar todos los registros
        String sql = "SELECT u.Usuario_email , u.idUsuario  "
                + "from sms_usuario as u  "
                + "WHERE "
                + "u.`idUsuario` = '" + usuario.getIdUsuario() + "' ; ";

        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        while (rs.next()) {
            user = new Usuario_TO(rs.getString(1), rs.getInt(2));

            registro = registro + 1;
        }

        System.out.print(user + "------------------------------");

        if (registro > 0) {

            if (!user.getEmail().equals("")) {//valida si el EMAIL existe en la BD

                user = new Usuario_TO();
                user.setMensaje("Email SI existe");

            } else {

                user = new Usuario_TO();
                user.setMensaje("Email no existe");
            }

        } else {

            user = new Usuario_TO();
            user.setMensaje("Email no existe");
        }
        return user;

    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public Usuario_TO consutarListaClientes(Usuario_TO cli) throws Exception {

        Usuario_TO usuarios = new Usuario_TO();

        try {
            usuarios = todosLosUsuarios(cli);
        } catch (Exception e) {
            throw e;
        }
        return usuarios;
    }

    private Usuario_TO todosLosUsuarios(Usuario_TO user) throws SQLException {

        Usuario_TO users = new Usuario_TO();

        try {

            String sql = "SELECT `idUsuario` , `Usuario_nombre`, `Usuario_CC`,`Usuario_pasaporte` , `Usuario_telefono`, `Usuario_email`, `idCiudad`,`Usuario_password` ,`Usuario_remember_token` ,`Usuario_EstadoUsuario` , `Usuario_foto_nombre`,`Usuario_foto_ruta`,`idRol` ,`idNacionalidad`  FROM `sms_usuario` WHERE `idRol` = " + user.getRol() + " AND  "
                    + " `idUsuario` =  " + user.getIdUsuario() + " ";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                users = new Usuario_TO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getInt(13),
                        rs.getInt(14));
            }

        } catch (Exception e) {
            throw e;
        }

        return users;
    }

    @Override
    public Usuario_TO consutarListaConductores(Usuario_TO usuario) throws Exception {
        Usuario_TO usuarios = new Usuario_TO();

        try {
            usuarios = todosLosConductores(usuario);
        } catch (Exception e) {
            throw e;
        }
        return usuarios;
    }

    private Usuario_TO todosLosConductores(Usuario_TO user) throws SQLException {

        Usuario_TO users = new Usuario_TO();

        try {

            String sql = "SELECT `idUsuario` , `Usuario_nombre`, `Usuario_CC`,`Usuario_pasaporte` , `Usuario_telefono`, `Usuario_email`, `idCiudad`,`Usuario_password` ,`Usuario_remember_token` ,`Usuario_EstadoUsuario` , `Usuario_foto_nombre`,`Usuario_foto_ruta`,`idRol` ,`idNacionalidad`  FROM `sms_usuario` WHERE `idRol` = " + user.getRol() + " AND  "
                    + " `idUsuario` =  " + user.getIdUsuario() + " ";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                users = new Usuario_TO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getInt(13),
                        rs.getInt(14));
            }

        } catch (Exception e) {
            throw e;
        }

        return users;
    }

    @Override
    public Estado_TO consultarEstdoUsuario(Usuario_TO usuario) throws Exception {

        Estado_TO est = new Estado_TO();

        try {

            est = consultarTodoEstadoUsuario(usuario);

        } catch (Exception e) {
            throw e;
        }
        return est;
    }

    private Estado_TO consultarTodoEstadoUsuario(Usuario_TO usuario) throws Exception {

        Estado_TO estado = new Estado_TO();
        try {
            String sql = " SELECT e.idEstado, e.Estado_nombre FROM `sms_estado` as e , `sms_empleado` as empl "
                    + "  WHERE empl.idEstado = e.`idEstado`AND "
                    + "  empl.idUsuario = " + usuario.getIdUsuario() + " ";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                estado = new Estado_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (Exception e) {
            throw e;
        }

        return estado;
    }

    @Override
    public Usuario_TO consultarIdEmpleado(Usuario_TO idEmpleado) throws Exception {

        Usuario_TO cond = new Usuario_TO();
        cond = todosLosIdEmpleados(idEmpleado);

        return cond;

    }

    private Usuario_TO todosLosIdEmpleados(Usuario_TO idEmpleado) throws SQLException {
        
        
        String sql = "SELECT idUsuario FROM `sms_empleado` "
                + "  WHERE idEmpleado = "+ idEmpleado.getIdEmpleado() +" ";
        ResultSet rs = st.executeQuery(sql);

        Usuario_TO user_conduc = new Usuario_TO();

        while (rs.next()) {
            user_conduc = new Usuario_TO(rs.getInt(1));

        }
        return user_conduc;
    }
    
      @Override
    public Usuario_TO consultarIdCliente(Usuario_TO idUsuario) throws Exception {

        Usuario_TO cond = new Usuario_TO();
        cond = todosLosIdCliente(idUsuario);

        return cond;

    }

    private Usuario_TO todosLosIdCliente(Usuario_TO idUsuario) throws SQLException {
        
        
        String sql = "SELECT idEmpleado FROM `sms_empleado` "
                + "  WHERE idUsuario = "+ idUsuario.getIdUsuario()+" ";
        ResultSet rs = st.executeQuery(sql);

        Usuario_TO user_conduc = new Usuario_TO();

        while (rs.next()) {
            user_conduc = new Usuario_TO(rs.getInt(1), 0L);

        }
        return user_conduc;
    }
}
