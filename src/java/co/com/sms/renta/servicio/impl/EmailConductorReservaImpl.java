/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.config.SendEmail;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.servicio.EmailConductorReserva;
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
@Path("/envioEmailConducReservacion")
public class EmailConductorReservaImpl implements EmailConductorReserva{

    @GET
    @Produces({"application/json"})
    public SendEmail envioEmailConductorReserva(@QueryParam("usuarioEmail") String usuarioEmail,    
            @QueryParam("usuarioNombreCliente") String usuarioNombreCliente, 
            @QueryParam("usuarioNombreConductor") String usuarioNombreConductor, 
            @QueryParam("cC") String cC, 
            @QueryParam("telefonoCliente") String telefonoCliente, 
            @QueryParam("marcaNombre") String marcaNombre, 
            @QueryParam("referenciaNombre") String referenciaNombre,
            @QueryParam("reserva_Lugar_Inicio") String reserva_Lugar_Inicio, 
            @QueryParam("reserva_Lugar_Destino") String reserva_Lugar_Destino, 
            @QueryParam("reserva_Fecha_Inico") String reserva_Fecha_Inico, 
            @QueryParam("reserva_Hora_Inicio") String reserva_Hora_Inicio, 
            @QueryParam("nombre_Ciudad_Inicio") String nombre_Ciudad_Inicio, 
            @QueryParam("reserva_Costo") int reserva_Costo) throws Exception {
        
//        vehiculo
        Vehiculo_TO veh = new Vehiculo_TO(referenciaNombre, marcaNombre);
//        conductor
        Usuario_TO conductor = new Usuario_TO(usuarioNombreConductor, usuarioEmail, 0);
//        cliente
        Usuario_TO cliente = new Usuario_TO(usuarioNombreCliente, cC, telefonoCliente, 0);
//        reserva
        Reservacion_TO reser = new Reservacion_TO(reserva_Lugar_Inicio, reserva_Lugar_Destino,
                nombre_Ciudad_Inicio, reserva_Fecha_Inico, reserva_Hora_Inicio, reserva_Costo);
        
        SendEmail emailReservaConductor = new SendEmail();
        emailReservaConductor.sendEmailConductorReserva(veh, reser, cliente, conductor);
        
        return emailReservaConductor;
    }
    
}
