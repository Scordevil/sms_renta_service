/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Ciudad_TO;
import co.com.sms.renta.persistencia.dao.CiudadDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class CiudadDAOImpl implements CiudadDAO{
    
    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * @return @throws Exception
     */
    @Override
    public List<Ciudad_TO> consultarCiudades()throws Exception{
     
        Statement st = ConexionSQL.conexion();
        List<Ciudad_TO> ciudades = new ArrayList<>();

        try {

            ciudades = consultarTodasCiudades();

        } catch (Exception e) {

            throw e;

        }
        
        return ciudades;
    }
    
    
    
    private List<Ciudad_TO> consultarTodasCiudades() throws SQLException {

        // // //Seleccionar todos los registros
        String sql = "SELECT idCiudad, idTipoLugar , Ciudad_nombre, idDepartamento "
                + "from sms_ciudad";
                
        ResultSet rs = st.executeQuery(sql);
        // LLAMA AL MÉTODO

        final List<Ciudad_TO> ciudades = new ArrayList<Ciudad_TO>();
        while (rs.next()) {

            ciudades.add(new Ciudad_TO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4)));

        }
        ConexionSQL.CerrarConexion();
        return ciudades;
    }
    
    
}
