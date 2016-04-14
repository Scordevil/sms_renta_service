/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Nacionalidad_TO;
import co.com.sms.renta.persistencia.dao.NacionalidadDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public class NacionalidadDAOImpl implements NacionalidadDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     *
     * @return @throws Exception
     */
    @Override
    public List<Nacionalidad_TO> consultarNacionalidades() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Nacionalidad_TO> nacionalidades = new ArrayList<>();

        try {

            nacionalidades = consultarTodasLasNacionalidades();
        } catch (Exception e) {
            throw e;
        }

        return nacionalidades;
    }

    private List<Nacionalidad_TO> consultarTodasLasNacionalidades() throws SQLException {

        // Sentencia para colocar e objeto que lee la BD
        String sql = "SELECT idNacionalidad, Nacionalidad_nombre FROM `sms_nacionalidad` ";

        ResultSet rs = st.executeQuery(sql);
         // Llama al metodo

        final List<Nacionalidad_TO> nacionalidades = new ArrayList<Nacionalidad_TO>();

        while (rs.next()) {

            nacionalidades.add(new Nacionalidad_TO(rs.getInt(1), rs.getString(2)));

        }
        ConexionSQL.CerrarConexion();
        return nacionalidades;
    }



}
