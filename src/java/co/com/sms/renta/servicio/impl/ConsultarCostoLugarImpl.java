/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.persistencia.dao.impl.Costos_ServiciosDAOImpl;
import co.com.sms.renta.servicio.ConsultarCostoLugar;
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
@Path("/consultarCostoLugar")
public class ConsultarCostoLugarImpl implements ConsultarCostoLugar {

    @GET
    @Produces({"application/json"})
    @Override
    public Costos_Servicios_TO ConsultarCostoLugar(@QueryParam("idServicio") int idServicio,
            @QueryParam("idCategoria") int idCategoria,
            @QueryParam("idLugarInicio") int idLugarInicio,
            @QueryParam("idLugarDestino") int idLugarDestino) throws Exception {

        Costos_Servicios_TO costLugar = new Costos_Servicios_TO(idServicio, idCategoria,
                idLugarInicio, idLugarDestino);

        Costos_Servicios_TO costFinal = new Costos_Servicios_TO();
        Costos_ServiciosDAOImpl costosLugarDAO = new Costos_ServiciosDAOImpl();
        costFinal = costosLugarDAO.consultarCostoLugar(costLugar);
        return costFinal;
    }

}
