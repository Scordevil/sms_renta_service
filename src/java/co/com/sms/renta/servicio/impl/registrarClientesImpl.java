/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.servicio.RegistrarCliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/registrarCliente")
public class registrarClientesImpl implements RegistrarCliente {

    @POST
    @Produces({"application/json", "application/xml"})
    public void registrarClientes(@QueryParam("idCiudad") int idCiudad) throws Exception{

       Usuario_TO cliente = new Usuario_TO();
        
    }

}
