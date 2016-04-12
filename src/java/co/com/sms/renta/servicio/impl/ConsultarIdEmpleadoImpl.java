/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.UsuarioDAO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.sms.renta.servicio.ConsultarIdEmpleado;
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
@Path("/consultarIdEmpleado")
public class ConsultarIdEmpleadoImpl implements ConsultarIdEmpleado {

    @GET
    @Produces({"application/json"})
    public Usuario_TO ConsultaerIdEMpleado(@QueryParam("idEmpleado") int idEmpleado) throws Exception {
        
        Usuario_TO user = new Usuario_TO(idEmpleado, 0L);
        Usuario_TO conductor = new Usuario_TO();
        UsuarioDAO userDAO = new UsuarioDAOImpl();
        conductor = userDAO.consultarIdEmpleado(user);
        
        return conductor;
    }

}
