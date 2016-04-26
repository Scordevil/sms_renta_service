package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Usuario
 *
 * Tabla Relacionada sms_usuario
 *
 * @author SMS
 */
@XmlRootElement
public class Usuario_TO {

    /**
     *
     * Columna idUsuario
     */
    private int idUsuario;

    /**
     *
     * Columna Usuario_nombre
     */
    private String nombre;

    /**
     *
     * Columna Usuario_CC - Cedula Ciudadania
     */
    private String CC;

    /**
     *
     * Columna Usuario_telefono
     */
    private String telefono;

    /**
     *
     * Columna Usuario_email
     */
    private String email;

    /**
     *
     * Columna Usuario_razonSocial
     */
    private String razonSocial;

    /**
     *
     * Columna Usuario_nit
     */
    private String nit;

    /**
     *
     * Columna Usuario_ciudad
     */
    private int idCiudad;

    /**
     *
     * Columna Usuario_Pasaporte
     */
    private String pasaporte;

    /**
     *
     * Tabla Ciudad
     *
     * Columna nombre_ciudad
     */
    private String nombreCiudad;

    /**
     *
     * Columna Usuario_password
     */
    private String password;

    /**
     *
     * Columna Usuario_remember_token
     */
    private String remember_token;

    /**
     *
     * Columna Usuario_EstadoUsuario
     */
    private int estadoUsuario;

    /**
     *
     * Columna Usuario_foto_nombre
     */
    private String foto_nombre;

    /**
     *
     * Columna Usuario_foto_ruta
     */
    private String foto_ruta;

    /**
     *
     * Columna Usuario_Rol
     */
    private int rol;

    /**
     *
     * Tabla Rol
     *
     * Columna id_rol
     */
    private String nombreRol;

    /**
     *
     * Columna idNacionalidad
     */
    private int idNacionalidad;
    
        /**
     *
     * Columna nombreNacionalidad
     */
    private String nombreNacionalidad;

    /**
     *
     * Tabla hojavida
     *
     * Columna hojaVida
     */
    private String hojaVida;

    /**
     *
     * Tabla Empleado
     *
     * Columna hojaVida
     */
    private int idHojaVida;

    /**
     *
     * Tabla Empleado
     *
     * Columna ESTADO
     */
    private int idEstado;

    /**
     *
     * Tabla PROVEEDOR
     *
     * Columna hojaVida
     */
    private int idProveedor;

    /**
     *
     * Tabla hojavida
     *
     * Columna RUTA
     */
    private String hojaVidaRuta;

    /**
     *
     * Tabla EMPLEADO
     *
     * Columna idEmpleado
     */
    private int idEmpleado;

    /**
     *
     * Tabla Sin tabla
     *
     * Mensaje acceder a la cuenta
     */
    private String mensaje;

    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, int idCiudad, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, int rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idCiudad = idCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.rol = rol;
    }

    public Usuario_TO(String nombre, String email, int idCiudad, String password, String remember_token, int estadoUsuario, int rol) {
        this.nombre = nombre;
        this.email = email;
        this.idCiudad = idCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;
    }

    public Usuario_TO(int idUsuario, String nombre, String email, int idCiudad, String pasaporte, String password, String remember_token, int idNacionalidad, int estadoUsuario, int rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.idCiudad = idCiudad;
        this.pasaporte = pasaporte;
        this.idNacionalidad = idNacionalidad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;

    }

    public Usuario_TO(String nombre, String email, int idCiudad, String pasaporte, String password, String remember_token, int idNacionalidad, int estadoUsuario, int rol) {
        this.nombre = nombre;
        this.email = email;
        this.idCiudad = idCiudad;
        this.pasaporte = pasaporte;
        this.idNacionalidad = idNacionalidad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;

    }

    //ConsultarEmpleados
    public Usuario_TO(int idUsuario, String nombre, String CC, String pasaporte, String telefono, String email, String nombreCiudad, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, String nombreRol, int idNacionalidad, String hojaVida, int idEstado, int idProveedor, String hojaVidaRuta) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.email = email;
        this.nombreCiudad = nombreCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.nombreRol = nombreRol;
        this.idNacionalidad = idNacionalidad;
        this.hojaVida = hojaVida;
        this.hojaVidaRuta = hojaVidaRuta;
        this.idEstado = idEstado;
        this.idProveedor = idProveedor;
    }

    //EditarClientes
    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, int idCiudad, String pasaporte, String password, String remember_token, int estadoUsuario, int rol, int idNacionalidad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.idCiudad = idCiudad;
        this.pasaporte = pasaporte;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;
        this.idNacionalidad = idNacionalidad;
    }
    
        //ConsultarClientes
    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, int idCiudad, String pasaporte, String password, String remember_token, int estadoUsuario, int rol, int idNacionalidad, String nombreCiudad, String nombreNacionalidad ) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.idCiudad = idCiudad;
        this.pasaporte = pasaporte;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;
        this.idNacionalidad = idNacionalidad;
        this.nombreCiudad = nombreCiudad;
        this.nombreNacionalidad = nombreNacionalidad;
    }

    //Editar Clientes 
    public Usuario_TO(int idUsuario, String nombre, String CC, String pasaporte, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
    }

    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, int idCiudad, String password, String remember_token) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idCiudad = idCiudad;
        this.password = password;
        this.remember_token = remember_token;
    }

    //Editar Empleados Conductores
    public Usuario_TO(String nombre, String CC, String pasaporte, String telefono, String email, int idCiudad, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, int rol, int idNacionalidad, String hojaVida, int idEstado, int idProveedor, String hojaVidaRuta, int idUsuario) {
        this.nombre = nombre;
        this.CC = CC;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.email = email;
        this.idCiudad = idCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.rol = rol;
        this.idNacionalidad = idNacionalidad;

//        Diferencia del metodo de Consula de Empleados al dejar el ID Usuario de ultimo
        this.hojaVida = hojaVida;
        this.idEstado = idEstado;
        this.idProveedor = idProveedor;
        this.hojaVidaRuta = hojaVidaRuta;
//         chupelo
        this.idUsuario = idUsuario;
    }

    //consultarProveedores
    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, String nombreCiudad, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, String nombreRol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.nombreCiudad = nombreCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.nombreRol = nombreRol;

    }
//      CONSULTAR CLIENTES

    public Usuario_TO(int idUsuario, String nombre, String CC, String pasaporte, String telefono, String email, int idCiudad, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, int rol, int idNacionalidad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.email = email;
        this.idCiudad = idCiudad;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.rol = rol;
        this.idNacionalidad = idNacionalidad;
    }

    public Usuario_TO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_TO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Usuario_TO(int idUsuario, int idNacionalidad) {
        this.idUsuario = idUsuario;
        this.idNacionalidad = idNacionalidad;
    }

//    CONSTRUCTOR PARA DITAR ESTADO DEL CONDUCTOR
    public Usuario_TO(int idUsuario, String val, int idEstado) {
        this.idUsuario = idUsuario;
        this.idEstado = idEstado;
    }

//    CONSTRUCTOR PARA VALIDFAR EL EMAILS
    public Usuario_TO(String email, int idUsuario) {
        this.email = email;
        this.idUsuario = idUsuario;
    }

//    CONSTRUCTOR para envio de email de bienvenida a clientes
    public Usuario_TO(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public Usuario_TO(int idUsuario, int idCiudad, String val) {
        this.idUsuario = idUsuario;
        this.idCiudad = idCiudad;
    }

    public Usuario_TO(int idUsuario, String password, String remember_token) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.remember_token = remember_token;
    }

//    CONSTRUCTOR PARA ENVIO DE EMAIL A CLIENTE DESPUES DE ERALIZAR RESERVA
    public Usuario_TO(String nombre, String email, int val) {
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario_TO(String nombre, String CC, String telefono, int var) {
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
    }

    public Usuario_TO(int idEmpleado, long var) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreNacionalidad() {
        return nombreNacionalidad;
    }

    public void setNombreNacionalidad(String nombreNacionalidad) {
        this.nombreNacionalidad = nombreNacionalidad;
    }
    
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getFoto_nombre() {
        return foto_nombre;
    }

    public void setFoto_nombre(String foto_nombre) {
        this.foto_nombre = foto_nombre;
    }

    public String getFoto_ruta() {
        return foto_ruta;
    }

    public void setFoto_ruta(String foto_ruta) {
        this.foto_ruta = foto_ruta;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getHojaVida() {
        return hojaVida;
    }

    public void setHojaVida(String hojaVida) {
        this.hojaVida = hojaVida;
    }

    public int getIdHojaVida() {
        return idHojaVida;
    }

    public void setIdHojaVida(int idHojaVida) {
        this.idHojaVida = idHojaVida;
    }

    public String getHojaVidaRuta() {
        return hojaVidaRuta;
    }

    public void setHojaVidaRuta(String hojaVidaRuta) {
        this.hojaVidaRuta = hojaVidaRuta;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

//    @Override
//    public String toString() {
//        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", CC=" + CC + ", telefono=" + telefono + ", email=" + email + ", razonSocial=" + razonSocial + ", nit=" + nit + ", idCiudad=" + idCiudad + ", pasaporte=" + pasaporte + ", nombreCiudad=" + nombreCiudad + ", password=" + password + ", remember_token=" + remember_token + ", estadoUsuario=" + estadoUsuario + ", foto_nombre=" + foto_nombre + ", foto_ruta=" + foto_ruta + ", rol=" + rol + ", nombreRol=" + nombreRol + ", idNacionalidad=" + idNacionalidad + ", hojaVida=" + hojaVida + ", idHojaVida=" + idHojaVida + ", hojaVidaRuta=" + hojaVidaRuta + ", mensaje=" + mensaje + '}';
//    }
    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", CC=" + CC + ", telefono=" + telefono + ", email=" + email + ", razonSocial=" + razonSocial + ", nit=" + nit + ", idCiudad=" + idCiudad + ", pasaporte=" + pasaporte + ", nombreCiudad=" + nombreCiudad + ", password=" + password + ", remember_token=" + remember_token + ", estadoUsuario=" + estadoUsuario + ", foto_nombre=" + foto_nombre + ", foto_ruta=" + foto_ruta + ", rol=" + rol + ", nombreRol=" + nombreRol + ", idNacionalidad=" + idNacionalidad + ", hojaVida=" + hojaVida + ", idHojaVida=" + idHojaVida + ", idEstado=" + idEstado + ", idProveedor=" + idProveedor + ", hojaVidaRuta=" + hojaVidaRuta + ", mensaje=" + mensaje + '}';
    }

}
