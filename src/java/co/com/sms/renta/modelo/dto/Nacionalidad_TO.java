/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VaioDevelopment
 */

/**
 *
 * Objeto de negocios que modelo una Nacionalidad
 *
 * Tabla Relacionada sms_servicios
 *
 * @author sms
 */
@XmlRootElement
public class Nacionalidad_TO {
    
    private int idNacionalidad;
    private String nacionalidad_nombre;

    public Nacionalidad_TO() {
    }

    public Nacionalidad_TO(int idNacionalidad, String Nacionalidad_nombre) {
        this.idNacionalidad = idNacionalidad;
        this.nacionalidad_nombre = Nacionalidad_nombre;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad_nombre() {
        return nacionalidad_nombre;
    }

    public void setNacionalidad_nombre(String Nacionalidad_nombre) {
        this.nacionalidad_nombre = Nacionalidad_nombre;
    }
    
    

    @Override
    public String toString() {
        return "Nacionalidad_TO{" + "idNacionalidad=" + idNacionalidad + ", Nacionalidad_nombre=" + nacionalidad_nombre + '}';
    }
    
    
    
}
