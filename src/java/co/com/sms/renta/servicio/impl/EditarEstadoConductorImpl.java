/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.EditarEstadoConductor;
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
@Path("/editarEstadoConductores")
public class EditarEstadoConductorImpl implements EditarEstadoConductor {

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO editarEstadoConductor(@QueryParam("idEstado") int idEstado,
            @QueryParam("idUsuario") int idUsuario) throws Exception {

        Usuario_TO conductorEstado = new Usuario_TO(idUsuario, "", idEstado);
        UsuarioDAOImpl user = new UsuarioDAOImpl();
        return user.editarEstadoConductor(conductorEstado);
    }

}
