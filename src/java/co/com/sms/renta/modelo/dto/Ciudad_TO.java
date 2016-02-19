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
     * Columna Ciudad_pais
     */
    private int idPais;

    /**
     *
     * Columna Ciudad_nombre
     */
    private String ciudadNombre;

    /**
     *
     * tabla sms_pais
     *
     * Columna Pais_nombre
     */
    private String nombrePais;

    public Ciudad_TO() {
    }

    public Ciudad_TO(int idCiudad, int idPais, String ciudadNombre, String nombrePais) {
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.ciudadNombre = ciudadNombre;
        this.nombrePais = nombrePais;
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

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getCiudadNombre() {
        return ciudadNombre;
    }

    public void setCiudadNombre(String ciudadNombre) {
        this.ciudadNombre = ciudadNombre;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idCiudad;
        hash = 97 * hash + this.idPais;
        hash = 97 * hash + Objects.hashCode(this.ciudadNombre);
        hash = 97 * hash + Objects.hashCode(this.nombrePais);
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
        final Ciudad_TO other = (Ciudad_TO) obj;
        if (this.idCiudad != other.idCiudad) {
            return false;
        }
        if (this.idPais != other.idPais) {
            return false;
        }
        if (!Objects.equals(this.ciudadNombre, other.ciudadNombre)) {
            return false;
        }
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ciudad_TO{" + "idCiudad=" + idCiudad + ", idPais=" + idPais + ", ciudadNombre=" + ciudadNombre + ", nombrePais=" + nombrePais + '}';
    }
    
}
