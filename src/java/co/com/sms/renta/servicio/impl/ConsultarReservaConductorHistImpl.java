/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.ReservacionDAOImpl;
import co.com.sms.renta.servicio.ConsultarReservaConductor;
import co.com.sms.renta.servicio.ConsultarReservaConductorHist;
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
@Path("/consultarReservacionConductor")
public class ConsultarReservaConductorHistImpl implements ConsultarReservaConductorHist {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Reservacion_TO> consultarReservasConductoresHist(@QueryParam("idEmpleado") int idEmpleado) throws Exception {

        Usuario_TO empleado = new Usuario_TO(idEmpleado , 0L);
        List<Reservacion_TO> reservaLista = new ArrayList<>();
        ReservacionDAOImpl reservaDAO = new ReservacionDAOImpl();

        reservaLista = reservaDAO.consultarReservasConductorHist(empleado);
        return reservaLista;
    }

}
