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
 * Objeto de negocios que modelo un Lugar
 *
 * Tabla Relacionada sms_lugares
 *
 * @author sms
 */
@XmlRootElement
public class Lugar_TO {
    
    /**
     *
     * Columna idLugar
     */
    private int idLugar;
    
    /**
     *
     * Columna Lugar_nombre
     */
    private String lugarNombre;
    
    /**
     *
     * Columna Lugar_direccion
     */
    private String lugarDireccion;
    
    /**
     *
     * Tabla sms_ciudad
     * 
     * Columna idCiudad
     */
    private int idCiudad;

    
    
    public Lugar_TO() {
    }

    public Lugar_TO(int idLugar, String lugarNombre, String lugarDireccion, int idCiudad) {
        this.idLugar = idLugar;
        this.lugarNombre = lugarNombre;
        this.lugarDireccion = lugarDireccion;
        this.idCiudad = idCiudad;
    }
    
    

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public String getLugarNombre() {
        return lugarNombre;
    }

    public void setLugarNombre(String lugarNombre) {
        this.lugarNombre = lugarNombre;
    }

    public String getLugarDireccion() {
        return lugarDireccion;
    }

    public void setLugarDireccion(String lugarDireccion) {
        this.lugarDireccion = lugarDireccion;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idLugar;
        hash = 67 * hash + Objects.hashCode(this.lugarNombre);
        hash = 67 * hash + Objects.hashCode(this.lugarDireccion);
        hash = 67 * hash + this.idCiudad;
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
        final Lugar_TO other = (Lugar_TO) obj;
        if (this.idLugar != other.idLugar) {
            return false;
        }
        if (!Objects.equals(this.lugarNombre, other.lugarNombre)) {
            return false;
        }
        if (!Objects.equals(this.lugarDireccion, other.lugarDireccion)) {
            return false;
        }
        if (this.idCiudad != other.idCiudad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lugar_TO{" + "idLugar=" + idLugar + ", lugarNombre=" + lugarNombre + ", lugarDireccion=" + lugarDireccion + ", idCiudad=" + idCiudad + '}';
    }
       
    
}
