/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.impl.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SMS
 */
@Stateless
@Path("/consultarEmpleados")
public class ConsultarEmpleadosImpl  {

    

    @GET
    @Produces({"application/json", "application/xml"})
    public List<Usuario_TO> consultarEmpleados() throws Exception {
        
        List<Usuario_TO> usuarios = new ArrayList<Usuario_TO>();
        UsuarioDAOImpl usuario = new UsuarioDAOImpl();
        
        usuarios = usuario.consultarEmpleados();
        
        return usuarios;

    }

}
