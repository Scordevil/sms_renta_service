/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Nacionalidad_TO;
import co.com.sms.renta.persistencia.dao.impl.NacionalidadDAOImpl;
import co.com.sms.renta.servicio.ConsultarNacionalidades;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author VaioDevelopment
 */
@Stateless
@Path("/consultarNacionalidades")
public class ConsultarNacionalidadesImpl implements ConsultarNacionalidades{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Nacionalidad_TO> consultarNacionalidades()throws Exception{
        
         List<Nacionalidad_TO> nacionalidades = new ArrayList<Nacionalidad_TO>();
         NacionalidadDAOImpl nacionalidad = new NacionalidadDAOImpl();
        
        nacionalidades = nacionalidad.consultarNacionalidades();
        
        return nacionalidades;

    }
    
}
