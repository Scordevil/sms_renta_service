/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Ciudad_TO;
import co.com.sms.renta.modelo.dto.Lugar_TO;
import co.com.sms.renta.persistencia.dao.LugarDAO;
import co.com.sms.renta.persistencia.dao.impl.LugarDAOImpl;
import co.com.sms.renta.servicio.ConsultarLugares;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/consultarLugares")
public class ConsultarLugaresImpl implements ConsultarLugares{
    
    @GET
    @Produces({"application/json"})
    public List<Lugar_TO> consultarLugares(@QueryParam("idCiudad") int idCiudad ) throws Exception{
        
        List<Lugar_TO> lugares = new ArrayList<Lugar_TO>();
        LugarDAOImpl lugarDAO = new LugarDAOImpl();

        Ciudad_TO ciudad = new Ciudad_TO(idCiudad);
        
        lugares = lugarDAO.consultarLugar(ciudad);
        
        return lugares;
         
    }
    
}
