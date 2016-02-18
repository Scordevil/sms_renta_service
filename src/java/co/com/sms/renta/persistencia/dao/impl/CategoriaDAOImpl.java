/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Categoria_TO;
import co.com.sms.renta.persistencia.dao.CategoriaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class CategoriaDAOImpl implements CategoriaDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Categoria_TO> consultarCategorias() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Categoria_TO> categorias = new ArrayList<>();

        try {

            categorias = consultarTodasCategorias();
        } catch (Exception e) {
            throw e;
        }

        return categorias;
    }

    private List<Categoria_TO> consultarTodasCategorias() throws SQLException {

        
        //Seleccionar datos de la tabla sms_categoria
        String sql = "Select c.idCategoria, c.Categoria_nombre, c.Categoria_descripcion "
                    +"from sms_categoria as c ";
        
        ResultSet rs = st.executeQuery(sql);
        
        //llama al metodo       
        final List<Categoria_TO> categorias = new ArrayList<>();
        while (rs.next()) {
            
            categorias.add(new Categoria_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        
        return categorias   ;

    }

}
