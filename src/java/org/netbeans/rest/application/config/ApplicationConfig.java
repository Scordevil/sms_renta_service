/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ContabilidadPC
 */
@javax.ws.rs.ApplicationPath("resources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.sms.renta.servicio.impl.ConsultarAdministradoresImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarCategoriasImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarCiudadesImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarClienteImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarClientesImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarDatosSesionUsuarioImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarEmpleadosImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarLugaresImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarNacionalidadesImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarProveedoresImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.ConsultarServiciosImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.EditarClienteImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.EditarConductorImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.EditarLocalidadClienteImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.EditarNacionalidadClienteImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.EditarPasswordClienteImpl.class);
        resources.add(co.com.sms.renta.servicio.impl.RegistrarClientesImpl.class);
    }
    
}
