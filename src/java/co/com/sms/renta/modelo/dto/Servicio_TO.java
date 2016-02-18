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
 * Objeto de negocios que modelo un Servicio
 *
 * Tabla Relacionada sms_servicios
 *
 * @author sms
 */
@XmlRootElement
public class Servicio_TO {
    
    /**
     *
     * Columna idServicios
     */
    private int idServicios;
    
    /**
     *
     * Columna Servicios_nombre
     */
    private String serviciosNombre;
    
    /**
     *
     * Columna Servicios_descripcion
     */
    private String serviciosDescripcion;

    
    public Servicio_TO() {
    }

    public Servicio_TO(int idServicios, String serviciosNombre, String serviciosDescripcion) {
        this.idServicios = idServicios;
        this.serviciosNombre = serviciosNombre;
        this.serviciosDescripcion = serviciosDescripcion;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getServiciosNombre() {
        return serviciosNombre;
    }

    public void setServiciosNombre(String serviciosNombre) {
        this.serviciosNombre = serviciosNombre;
    }

    public String getServiciosDescripcion() {
        return serviciosDescripcion;
    }

    public void setServiciosDescripcion(String serviciosDescripcion) {
        this.serviciosDescripcion = serviciosDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idServicios;
        hash = 67 * hash + Objects.hashCode(this.serviciosNombre);
        hash = 67 * hash + Objects.hashCode(this.serviciosDescripcion);
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
        final Servicio_TO other = (Servicio_TO) obj;
        if (this.idServicios != other.idServicios) {
            return false;
        }
        if (!Objects.equals(this.serviciosNombre, other.serviciosNombre)) {
            return false;
        }
        if (!Objects.equals(this.serviciosDescripcion, other.serviciosDescripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servicio_TO{" + "idServicios=" + idServicios + ", serviciosNombre=" + serviciosNombre + ", serviciosDescripcion=" + serviciosDescripcion + '}';
    }
    
    
    
}
