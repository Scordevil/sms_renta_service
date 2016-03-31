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
    private String servicioNombre;

    /**
     *
     * Columna Servicios_descripcion
     */
    private String servicioDescripcion;

    /**
     *
     * Columna idServicios
     */
    private int idCategoriaServicio;

    /**
     *
     * Columna idServicios
     */
    private int servicioDuracion;

    /**
     *
     * Columna idServicios
     */
    private int servicioConductor;

    public Servicio_TO() {
    }

    public Servicio_TO(int idServicios, String servicioNombre, String servicioDescripcion, int idCategoriaServicio, int servicioDuracion, int servicioConductor) {
        this.idServicios = idServicios;
        this.servicioNombre = servicioNombre;
        this.servicioDescripcion = servicioDescripcion;
        this.idCategoriaServicio = idCategoriaServicio;
        this.servicioDuracion = servicioDuracion;
        this.servicioConductor = servicioConductor;
    }

    public Servicio_TO(int idServicios, String servicioNombre, String servicioDescripcion) {
        this.idServicios = idServicios;
        this.servicioNombre = servicioNombre;
        this.servicioDescripcion = servicioDescripcion;
    }
    
    

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getServicioNombre() {
        return servicioNombre;
    }

    public void setServicioNombre(String servicioNombre) {
        this.servicioNombre = servicioNombre;
    }

    public String getServicioDescripcion() {
        return servicioDescripcion;
    }

    public void setServicioDescripcion(String servicioDescripcion) {
        this.servicioDescripcion = servicioDescripcion;
    }

    public int getIdCategoriaServicio() {
        return idCategoriaServicio;
    }

    public void setIdCategoriaServicio(int idCategoriaServicio) {
        this.idCategoriaServicio = idCategoriaServicio;
    }

    public int getServicioDuracion() {
        return servicioDuracion;
    }

    public void setServicioDuracion(int servicioDuracion) {
        this.servicioDuracion = servicioDuracion;
    }

    public int getServicioConductor() {
        return servicioConductor;
    }

    public void setServicioConductor(int servicioConductor) {
        this.servicioConductor = servicioConductor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idServicios;
        hash = 29 * hash + Objects.hashCode(this.servicioNombre);
        hash = 29 * hash + Objects.hashCode(this.servicioDescripcion);
        hash = 29 * hash + this.idCategoriaServicio;
        hash = 29 * hash + this.servicioDuracion;
        hash = 29 * hash + this.servicioConductor;
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
        if (!Objects.equals(this.servicioNombre, other.servicioNombre)) {
            return false;
        }
        if (!Objects.equals(this.servicioDescripcion, other.servicioDescripcion)) {
            return false;
        }
        if (this.idCategoriaServicio != other.idCategoriaServicio) {
            return false;
        }
        if (this.servicioDuracion != other.servicioDuracion) {
            return false;
        }
        if (this.servicioConductor != other.servicioConductor) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Servicio_TO{" + "idServicios=" + idServicios + ", servicioNombre=" + servicioNombre + ", servicioDescripcion=" + servicioDescripcion + ", idCategoriaServicio=" + idCategoriaServicio + ", servicioDuracion=" + servicioDuracion + ", servicioConductor=" + servicioConductor + '}';
    }

    
}
