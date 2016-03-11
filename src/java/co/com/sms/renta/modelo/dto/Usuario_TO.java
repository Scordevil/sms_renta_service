package co.com.sms.renta.modelo.dto;

import java.util.Objects;
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
     * Tabla Ciudad
     *
     * Columna nombre_ciudad
     */
    private String nombreCiudad;

    /**
     *
     * Columna Usuario_login
     */
    private String login;

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
     * Tabla hojavida
     *
     * Columna RUTA
     */
    private String hojaVidaRuta;

    /**
     *
     * Tabla Sin tabla
     *
     * Mensaje acceder a la cuenta
     */
    private String mensaje;

    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, int idCiudad, String login, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, int rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idCiudad = idCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.rol = rol;
    }

    public Usuario_TO(String nombre, String email, int idCiudad, String login, String password, String remember_token, int estadoUsuario, int rol) {
        this.nombre = nombre;
        this.email = email;
        this.idCiudad = idCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.rol = rol;
    }





    
    //ConsultarEmpleados
    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, String nombreCiudad, String login, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, String nombreRol, String hojaVida, String hojaVidaRuta) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.nombreCiudad = nombreCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.nombreRol = nombreRol;
        this.hojaVida = hojaVida;
        this.hojaVidaRuta = hojaVidaRuta;
    }

    //RegistrarClientes
    public Usuario_TO(String nombre, String CC, String telefono, String email, String razonSocial, String nit, int idCiudad, String login, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, int rol) {
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idCiudad = idCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.rol = rol;
    }

    //Editar Clientes 
    public Usuario_TO(String nombre, String CC, String telefono, String email, String razonSocial, String nit, int idCiudad, String login, String password, String remember_token, int idUsuario) {
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idCiudad = idCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;

//     para diferenciar el contructor de registro de cliente con el de Edicion
//     de perfil del Cliente se agrega el ID del usuario al final del constructor
        this.idUsuario = idUsuario;
    }

    //Editar Empleados Conductores
    public Usuario_TO(String nombre, String CC, String telefono, String email, String razonSocial, String nit, String nombreCiudad, String login, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, String nombreRol,  String hojaVida, String hojaVidaRuta, int idUsuario) {
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.nombreCiudad = nombreCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.nombreRol = nombreRol;

//        Diferencia del metodo de Consula de Empleados al dejar el ID Usuario de ultimo
        this.hojaVida = hojaVida;
        this.hojaVidaRuta = hojaVidaRuta;
        this.idUsuario = idUsuario;
    }

    //consultarProveedores
    public Usuario_TO(int idUsuario, String nombre, String CC, String telefono, String email, String razonSocial, String nit, String nombreCiudad, String login, String password, String remember_token, int estadoUsuario, String foto_nombre, String foto_ruta, String nombreRol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.CC = CC;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.nombreCiudad = nombreCiudad;
        this.login = login;
        this.password = password;
        this.remember_token = remember_token;
        this.estadoUsuario = estadoUsuario;
        this.foto_nombre = foto_nombre;
        this.foto_ruta = foto_ruta;
        this.nombreRol = nombreRol;

    }

    public Usuario_TO(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario_TO(String login, String password) {
        this.login = login;
        this.password = password;
    }

//    @XmlAttribute(name = "idUsuario")
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

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idUsuario;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.CC);
        hash = 23 * hash + Objects.hashCode(this.telefono);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.razonSocial);
        hash = 23 * hash + Objects.hashCode(this.nit);
        hash = 23 * hash + this.idCiudad;
        hash = 23 * hash + Objects.hashCode(this.nombreCiudad);
        hash = 23 * hash + Objects.hashCode(this.login);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.remember_token);
        hash = 23 * hash + this.estadoUsuario;
        hash = 23 * hash + Objects.hashCode(this.foto_nombre);
        hash = 23 * hash + Objects.hashCode(this.foto_ruta);
        hash = 23 * hash + this.rol;
        hash = 23 * hash + Objects.hashCode(this.nombreRol);
        hash = 23 * hash + Objects.hashCode(this.hojaVida);
        hash = 23 * hash + this.idHojaVida;
        hash = 23 * hash + Objects.hashCode(this.hojaVidaRuta);
        hash = 23 * hash + Objects.hashCode(this.mensaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario_TO other = (Usuario_TO) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.CC, other.CC)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (this.idCiudad != other.idCiudad) {
            return false;
        }
        if (!Objects.equals(this.nombreCiudad, other.nombreCiudad)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.remember_token, other.remember_token)) {
            return false;
        }
        if (this.estadoUsuario != other.estadoUsuario) {
            return false;
        }
        if (!Objects.equals(this.foto_nombre, other.foto_nombre)) {
            return false;
        }
        if (!Objects.equals(this.foto_ruta, other.foto_ruta)) {
            return false;
        }
        if (this.rol != other.rol) {
            return false;
        }
        if (!Objects.equals(this.nombreRol, other.nombreRol)) {
            return false;
        }
        if (!Objects.equals(this.hojaVida, other.hojaVida)) {
            return false;
        }
        if (this.idHojaVida != other.idHojaVida) {
            return false;
        }
        if (!Objects.equals(this.hojaVidaRuta, other.hojaVidaRuta)) {
            return false;
        }
        if (!Objects.equals(this.mensaje, other.mensaje)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", CC=" + CC + ", telefono=" + telefono + ", email=" + email + ", razonSocial=" + razonSocial + ", nit=" + nit + ", idCiudad=" + idCiudad + ", nombreCiudad=" + nombreCiudad + ", login=" + login + ", password=" + password + ", remember_token=" + remember_token + ", estadoUsuario=" + estadoUsuario + ", foto_nombre=" + foto_nombre + ", foto_ruta=" + foto_ruta + ", rol=" + rol + ", nombreRol=" + nombreRol + ", hojaVida=" + hojaVida + ", idHojaVida=" + idHojaVida + ", hojaVidaRuta=" + hojaVidaRuta + ", mensaje=" + mensaje + '}';
    }

}
