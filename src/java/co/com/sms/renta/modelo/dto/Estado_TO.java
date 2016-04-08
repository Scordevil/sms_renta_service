/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modela un Estado
 *
 * Tabla Relacionada sms_estado
 *
 * @author sms
 */
@XmlRootElement
public class Estado_TO {

    /**
     *
     * Columna idEstado
     */
    private int idEstado;

    /**
     *
     * Columna Estado_nombre
     */
    private String estado_nombre;

    /**
     *
     * Columna Estado_descripcion
     */
    private String estado_descripcion;

    public Estado_TO() {
    }

    public Estado_TO(int idEstado, String estado_nombre, String estado_descripcion) {
        this.idEstado = idEstado;
        this.estado_nombre = estado_nombre;
        this.estado_descripcion = estado_descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado_nombre() {
        return estado_nombre;
    }

    public void setEstado_nombre(String estado_nombre) {
        this.estado_nombre = estado_nombre;
    }

    public String getEstado_descripcion() {
        return estado_descripcion;
    }

    public void setEstado_descripcion(String estado_descripcion) {
        this.estado_descripcion = estado_descripcion;
    }

    @Override
    public String toString() {
        return "Estado_TO{" + "idEstado=" + idEstado + ", estado_nombre=" + estado_nombre + ", estado_descripcion=" + estado_descripcion + '}';
    }

}
