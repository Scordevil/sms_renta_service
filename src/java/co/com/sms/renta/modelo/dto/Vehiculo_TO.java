/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios de modelo Vehiculo
 *
 * Tabla Relacionada sms_vehiculo
 *
 * @author SMS
 */
@XmlRootElement
public class Vehiculo_TO {

    /**
     *
     * Columna idVehiculo
     */
    int idVehiculo;

    /**
     *
     * Columna Veh_placa
     */
    String vehi_Placa;

    /**
     *
     * Columna Veh_modelo
     */
    String vehi_Modelo;

    /**
     *
     * Columna idCategoria
     */
    int idCategoria;

    /**
     *
     * DE LA TABLA SMS_CATEGORIA
     *
     * Columna Categoria_nombre
     */
    String Categoria_nombre;

    /**
     *
     * Columna idReferencia
     */
    int idReferencia;

    /**
     *
     * DE LA TABLA SMS_referencia
     *
     * Columna Referencia_nombre
     */
    String Referencia_nombre;

    /**
     *
     * Columna Veh_num_personas
     */
    int veh_num_personas;

    /**
     *
     * Columna Veh_num_malGrande
     */
    int veh_num_malGrande;

    /**
     *
     * Columna Veh_num_malPequeña
     */
    int veh_num_malPequena;

    /**
     *
     * Columna idCiudad
     */
    int idCiudad;

    /**
     *
     * DE LA TABLA SMS_CIUDAD
     *
     * Columna Ciudad_nombre
     */
    String Ciudad_nombre;

    /**
     *
     * Columna idProveedor
     */
    int idProveedor;

    /**
     *
     * Columna Veh_foto_nombre
     */
    String veh_foto_nombre;

    /**
     *
     * Columna Veh_foto_ruta
     */
    String veh_foto_ruta;

    /**
     *
     * Columna Veh_foto2_nombre
     */
    String veh_foto2_nombre;

    /**
     *
     * Columna Veh_foto2_ruta
     */
    String veh_foto2_ruta;

    /**
     *
     * Columna idColor
     */
    int idColor;

    /**
     *
     * DE LA TABLA SMS_COLOR
     *
     * Columna Color_nombre
     */
    String Color_nombre;

    /**
     *
     * Columna idEstado
     */
    int idEstado;

    /**
     *
     * DE LA TABLA SMS_ESTADO
     *
     * Columna Estado_nombre
     */
    String Estado_nombre;

    /**
     *
     * DE LA TABLA SMS_USUARIO
     *
     * Columna Usuario_nombre
     */
    String usuario_nombre;

    /**
     *
     * DE LA TABLA SMS_USUARIO
     *
     * Columna idUsuario
     */
    int idUsuario;
    
    /**
     *
     * DE LA TABLA SMS_EMPLEADO
     *
     * Columna idEmpleado
     */
    int idEmpleado;

    /**
     *
     * DE LA TABLA SMS_MARCA
     *
     * Columna Marca_nombre
     */
    String marcaNombre;

    /**
     *
     * Tabla Sin tabla
     *
     * Mensaje acceder a la cuenta
     */
    private String mensaje;

//    CONTRUCTORES
    public Vehiculo_TO() {
    }

    public Vehiculo_TO(int idVehiculo, String vehi_Placa, String vehi_Modelo, int idCategoria, int idReferencia, int veh_num_personas, int veh_num_malGrande, int veh_num_malPequena, int idCiudad, int idProveedor, String veh_foto_nombre, String veh_foto_ruta, String veh_foto2_nombre, String veh_foto2_ruta, int idColor, int idEstado, String marcaNombre, String mensaje) {
        this.idVehiculo = idVehiculo;
        this.vehi_Placa = vehi_Placa;
        this.vehi_Modelo = vehi_Modelo;
        this.idCategoria = idCategoria;
        this.idReferencia = idReferencia;
        this.veh_num_personas = veh_num_personas;
        this.veh_num_malGrande = veh_num_malGrande;
        this.veh_num_malPequena = veh_num_malPequena;
        this.idCiudad = idCiudad;
        this.idProveedor = idProveedor;
        this.veh_foto_nombre = veh_foto_nombre;
        this.veh_foto_ruta = veh_foto_ruta;
        this.veh_foto2_nombre = veh_foto2_nombre;
        this.veh_foto2_ruta = veh_foto2_ruta;
        this.idColor = idColor;
        this.idEstado = idEstado;
        this.marcaNombre = marcaNombre;
        this.mensaje = mensaje;
    }

//    EDITAR ESTADO VEHICULO
    public Vehiculo_TO(int idVehiculo, String val, int idEstado) {
        this.idVehiculo = idVehiculo;
        this.idEstado = idEstado;
    }

//    CONSULTA DE VEHICULOS
    public Vehiculo_TO(int idVehiculo, String vehi_Placa, String vehi_Modelo, String Categoria_nombre, String Referencia_nombre, int veh_num_personas, int veh_num_malGrande, int veh_num_malPequena, String Ciudad_nombre, int idProveedor, String veh_foto_nombre, String veh_foto_ruta, String veh_foto2_nombre, String veh_foto2_ruta, String Color_nombre, String Estado_nombre, String usuario_nombre, int idEmpleado) {
        this.idVehiculo = idVehiculo;
        this.vehi_Placa = vehi_Placa;
        this.vehi_Modelo = vehi_Modelo;
        this.Categoria_nombre = Categoria_nombre;
        this.Referencia_nombre = Referencia_nombre;
        this.veh_num_personas = veh_num_personas;
        this.veh_num_malGrande = veh_num_malGrande;
        this.veh_num_malPequena = veh_num_malPequena;
        this.Ciudad_nombre = Ciudad_nombre;
        this.idProveedor = idProveedor;
        this.veh_foto_nombre = veh_foto_nombre;
        this.veh_foto_ruta = veh_foto_ruta;
        this.veh_foto2_nombre = veh_foto2_nombre;
        this.veh_foto2_ruta = veh_foto2_ruta;
        this.Color_nombre = Color_nombre;
        this.Estado_nombre = Estado_nombre;
        this.usuario_nombre = usuario_nombre;
        this.idEmpleado = idEmpleado;
    }

//    CONSTRUCTOR PARA ENVIO DE CORREOS AL CLIENTE QUE ERALIZO UNA RESERVACION
    public Vehiculo_TO(String Referencia_nombre, String marcaNombre) {
        this.Referencia_nombre = Referencia_nombre;
        this.marcaNombre = marcaNombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
    public String getMarcaNombre() {
        return marcaNombre;
    }

    public void setMarcaNombre(String marcaNombre) {
        this.marcaNombre = marcaNombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getVehi_Placa() {
        return vehi_Placa;
    }

    public void setVehi_Placa(String vehi_Placa) {
        this.vehi_Placa = vehi_Placa;
    }

    public String getVehi_Modelo() {
        return vehi_Modelo;
    }

    public void setVehi_Modelo(String vehi_Modelo) {
        this.vehi_Modelo = vehi_Modelo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }

    public int getVeh_num_personas() {
        return veh_num_personas;
    }

    public void setVeh_num_personas(int veh_num_personas) {
        this.veh_num_personas = veh_num_personas;
    }

    public int getVeh_num_malGrande() {
        return veh_num_malGrande;
    }

    public void setVeh_num_malGrande(int veh_num_malGrande) {
        this.veh_num_malGrande = veh_num_malGrande;
    }

    public int getVeh_num_malPequena() {
        return veh_num_malPequena;
    }

    public void setVeh_num_malPequeña(int veh_num_malPequena) {
        this.veh_num_malPequena = veh_num_malPequena;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getVeh_foto_nombre() {
        return veh_foto_nombre;
    }

    public void setVeh_foto_nombre(String veh_foto_nombre) {
        this.veh_foto_nombre = veh_foto_nombre;
    }

    public String getVeh_foto_ruta() {
        return veh_foto_ruta;
    }

    public void setVeh_foto_ruta(String veh_foto_ruta) {
        this.veh_foto_ruta = veh_foto_ruta;
    }

    public String getVeh_foto2_nombre() {
        return veh_foto2_nombre;
    }

    public void setVeh_foto2_nombre(String veh_foto2_nombre) {
        this.veh_foto2_nombre = veh_foto2_nombre;
    }

    public String getVeh_foto2_ruta() {
        return veh_foto2_ruta;
    }

    public void setVeh_foto2_ruta(String veh_foto2_ruta) {
        this.veh_foto2_ruta = veh_foto2_ruta;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCategoria_nombre() {
        return Categoria_nombre;
    }

    public void setCategoria_nombre(String Categoria_nombre) {
        this.Categoria_nombre = Categoria_nombre;
    }

    public String getReferencia_nombre() {
        return Referencia_nombre;
    }

    public void setReferencia_nombre(String Referencia_nombre) {
        this.Referencia_nombre = Referencia_nombre;
    }

    public String getCiudad_nombre() {
        return Ciudad_nombre;
    }

    public void setCiudad_nombre(String Ciudad_nombre) {
        this.Ciudad_nombre = Ciudad_nombre;
    }

    public String getColor_nombre() {
        return Color_nombre;
    }

    public void setColor_nombre(String Color_nombre) {
        this.Color_nombre = Color_nombre;
    }

    public String getEstado_nombre() {
        return Estado_nombre;
    }

    public void setEstado_nombre(String Estado_nombre) {
        this.Estado_nombre = Estado_nombre;
    }

    @Override
    public String toString() {
        return "Vehiculo_TO{" + "idVehiculo=" + idVehiculo + ", vehi_Placa=" + vehi_Placa + ", vehi_Modelo=" + vehi_Modelo + ", idCategoria=" + idCategoria + ", Categoria_nombre=" + Categoria_nombre + ", idReferencia=" + idReferencia + ", Referencia_nombre=" + Referencia_nombre + ", veh_num_personas=" + veh_num_personas + ", veh_num_malGrande=" + veh_num_malGrande + ", veh_num_malPeque\u00f1a=" + veh_num_malPequeña + ", idCiudad=" + idCiudad + ", Ciudad_nombre=" + Ciudad_nombre + ", idProveedor=" + idProveedor + ", veh_foto_nombre=" + veh_foto_nombre + ", veh_foto_ruta=" + veh_foto_ruta + ", veh_foto2_nombre=" + veh_foto2_nombre + ", veh_foto2_ruta=" + veh_foto2_ruta + ", idColor=" + idColor + ", Color_nombre=" + Color_nombre + ", idEstado=" + idEstado + ", Estado_nombre=" + Estado_nombre + ", usuario_nombre=" + usuario_nombre + ", idUsuario=" + idUsuario + ", marcaNombre=" + marcaNombre + ", mensaje=" + mensaje + '}';
    }

}
