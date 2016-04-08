/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.persistencia.dao.impl.EstadoDAOImpl;
import co.com.sms.renta.servicio.ConsultarEstados;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/consultarEstados")
public class ConsultarEstadosImpl implements ConsultarEstados{

    @GET
    @Produces({"application/json"})
    public List<Estado_TO> consultarLisaEstados() throws Exception {
        
        List<Estado_TO> consulEstados = new ArrayList<>();
        EstadoDAOImpl estadoDAO = new EstadoDAOImpl();
        consulEstados = estadoDAO.consultarEstados();
        
        return consulEstados;
    }
    
}
