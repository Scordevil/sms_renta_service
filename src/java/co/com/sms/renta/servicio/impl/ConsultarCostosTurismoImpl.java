/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.persistencia.dao.impl.Costos_ServiciosDAOImpl;
import co.com.sms.renta.servicio.ConsultarCostosTurismo;
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
@Path("/consultarCostosTurismo")
public class ConsultarCostosTurismoImpl implements ConsultarCostosTurismo {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Costos_Servicios_TO> ConsultarCostosTurismo() throws Exception {

        List<Costos_Servicios_TO> costFinal = new ArrayList<>();
        Costos_ServiciosDAOImpl costosLugarDAO = new Costos_ServiciosDAOImpl();
        costFinal = costosLugarDAO.consultarCostosTurismo();
        return costFinal;
    }

}
