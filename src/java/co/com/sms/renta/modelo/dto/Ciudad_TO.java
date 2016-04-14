/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo una Ciudad
 *
 * Tabla Relacionada sms_ciudad
 *
 * @author sms
 */
@XmlRootElement
public class Ciudad_TO {

    /**
     *
     * Columna idCiudad
     */
    private int idCiudad;

    /**
     *
     * Columna IdTipoLugar
     */
    private int idTipoLugar;

    /**
     *
     * Columna Ciudad_nombre
     */
    private String ciudadNombre;

    /**

     * Columna IdDepartamento
     */
    private int idDepartamento;

    public Ciudad_TO() {
    }

    public Ciudad_TO(int idCiudad, int idTipoLugar, String ciudadNombre, int idDepartamento) {
        this.idCiudad = idCiudad;
        this.idTipoLugar = idTipoLugar;
        this.ciudadNombre = ciudadNombre;
        this.idDepartamento = idDepartamento;
    }

    public Ciudad_TO(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdTipoLugar() {
        return idTipoLugar;
    }

    public void setIdTipoLugar(int idTipoLugar) {
        this.idTipoLugar = idTipoLugar;
    }

    public String getCiudadNombre() {
        return ciudadNombre;
    }

    public void setCiudadNombre(String ciudadNombre) {
        this.ciudadNombre = ciudadNombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Ciudad_TO{" + "idCiudad=" + idCiudad + ", idTipoLugar=" + idTipoLugar + ", ciudadNombre=" + ciudadNombre + ", idDepartamento=" + idDepartamento + '}';
    }
    
    

 
}