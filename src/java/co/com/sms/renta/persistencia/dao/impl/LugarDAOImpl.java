/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Ciudad_TO;
import co.com.sms.renta.modelo.dto.Lugar_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.LugarDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class LugarDAOImpl implements LugarDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * @param ciudad
     * @return @throws Exception
     */
    @Override
    public List<Lugar_TO> consultarLugar(Ciudad_TO ciudad) throws Exception {

        List<Lugar_TO> lugares = new ArrayList<>();

        try {

            lugares = consultarTodosLugares(ciudad);
        } catch (Exception e) {
            throw e;
        }

        return lugares;
    }

    private List<Lugar_TO> consultarTodosLugares(Ciudad_TO ciudad) throws SQLException {

        List<Lugar_TO> lugares = new ArrayList<Lugar_TO>();
                try {
        // Sentencia para colocar e objeto que lee la BD
        String sql = "Select l.idlugar, l.Lugar_nombre, l.Lugar_direccion, "
                + " l.idCiudad , l.idLocalidad from sms_lugares as l, sms_ciudad as c "
                + "where l.idCiudad = c.idCiudad and l.idCiudad = " + ciudad.getIdCiudad() +" "
                + " order by l.Lugar_nombre asc";

        ResultSet rs = st.executeQuery(sql);
         // Llama al metodo

      

        while (rs.next()) {

            lugares.add(new Lugar_TO(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getInt(4), rs.getInt(5)));

        }
        
         } catch (Exception e) {

            lugares = new ArrayList<Lugar_TO>();
               throw e;

        }
        ConexionSQL.CerrarConexion();
        return lugares;
    }

}
