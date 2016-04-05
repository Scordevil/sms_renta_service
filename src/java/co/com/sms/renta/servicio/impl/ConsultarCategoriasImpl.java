/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Categoria_TO;
import co.com.sms.renta.persistencia.dao.impl.CategoriaDAOImpl;
import co.com.sms.renta.servicio.ConsultarCategorias;
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
@Path("/consultarCategorias")
public class ConsultarCategoriasImpl implements ConsultarCategorias{
    
     @GET
    @Produces({"application/json"})
     public List<Categoria_TO> consultarCategorias(@QueryParam("idMercado")int idMercado) throws Exception{
        
        List<Categoria_TO> categorias = new ArrayList<Categoria_TO>();
        CategoriaDAOImpl categoria = new CategoriaDAOImpl();
        Categoria_TO cat = new Categoria_TO(idMercado, "");
        
        categorias = categoria.consultarCategorias(cat);
        
        return categorias;
    }
    
    
    
}
