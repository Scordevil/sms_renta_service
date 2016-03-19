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
     * Columna idReferencia
     */
    int idReferencia;

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
    int veh_num_malPequeña;

    /**
     *
     * Columna idCiudad
     */
    int idCiudad;

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
     * Columna 	idColor
     */
    int idColor;
    
    /**
     *
     * Columna idEstado
     */
    int idEstado;
    
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

    public Vehiculo_TO(int idVehiculo, String vehi_Placa, String vehi_Modelo, int idCategoria, int idReferencia, int veh_num_personas, int veh_num_malGrande, int veh_num_malPequeña, int idCiudad, int idProveedor, String veh_foto_nombre, String veh_foto_ruta, String veh_foto2_nombre, String veh_foto2_ruta, int idColor, int idEstado, String mensaje) {
        this.idVehiculo = idVehiculo;
        this.vehi_Placa = vehi_Placa;
        this.vehi_Modelo = vehi_Modelo;
        this.idCategoria = idCategoria;
        this.idReferencia = idReferencia;
        this.veh_num_personas = veh_num_personas;
        this.veh_num_malGrande = veh_num_malGrande;
        this.veh_num_malPequeña = veh_num_malPequeña;
        this.idCiudad = idCiudad;
        this.idProveedor = idProveedor;
        this.veh_foto_nombre = veh_foto_nombre;
        this.veh_foto_ruta = veh_foto_ruta;
        this.veh_foto2_nombre = veh_foto2_nombre;
        this.veh_foto2_ruta = veh_foto2_ruta;
        this.idColor = idColor;
        this.idEstado = idEstado;
        this.mensaje = mensaje;
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

    public int getVeh_num_malPequeña() {
        return veh_num_malPequeña;
    }

    public void setVeh_num_malPequeña(int veh_num_malPequeña) {
        this.veh_num_malPequeña = veh_num_malPequeña;
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

    @Override
    public String toString() {
        return "Vehiculo_TO{" + "idVehiculo=" + idVehiculo + ", vehi_Placa=" + vehi_Placa + ", vehi_Modelo=" + vehi_Modelo + ", idCategoria=" + idCategoria + ", idReferencia=" + idReferencia + ", veh_num_personas=" + veh_num_personas + ", veh_num_malGrande=" + veh_num_malGrande + ", veh_num_malPeque\u00f1a=" + veh_num_malPequeña + ", idCiudad=" + idCiudad + ", idProveedor=" + idProveedor + ", veh_foto_nombre=" + veh_foto_nombre + ", veh_foto_ruta=" + veh_foto_ruta + ", veh_foto2_nombre=" + veh_foto2_nombre + ", veh_foto2_ruta=" + veh_foto2_ruta + ", idColor=" + idColor + ", idEstado=" + idEstado + ", mensaje=" + mensaje + '}';
    }
    
    

}
