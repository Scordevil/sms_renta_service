/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.persistencia.dao.EstadoDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class EstadoDAOImpl implements EstadoDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public List<Estado_TO> consultarEstados() throws Exception {

        List<Estado_TO> estados = new ArrayList<>();
        try {
            estados = todosLosEstados();

        } catch (Exception e) {
            throw e;
        }

        return estados;
    }

    private List<Estado_TO> todosLosEstados() throws Exception {

        List<Estado_TO> estadoLista = new ArrayList<>();
        try {
            String sql = "SELECT `idEstado`, `Estado_nombre`, `Estado_descripcion` "
                    + " FROM `sms_estado` WHERE `idEstado` IN (1,2,3)";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                estadoLista.add(new Estado_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));

            }

        } catch (Exception e) {
            throw e;
        }

        return estadoLista;
    }

    @Override
    public List<Estado_TO> consultarEstadosRestantes() throws Exception {
        List<Estado_TO> estados2 = new ArrayList<>();
        try {
            estados2 = todosLosEstados2();

        } catch (Exception e) {
            throw e;
        }

        return estados2;
    }
    
    private List<Estado_TO> todosLosEstados2() throws Exception {

        List<Estado_TO> estadoLista = new ArrayList<>();
        try {
            String sql = "SELECT `idEstado`, `Estado_nombre`, `Estado_descripcion` "
                    + " FROM `sms_estado` WHERE `idEstado` IN (4,5,6)";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                estadoLista.add(new Estado_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));

            }

        } catch (Exception e) {
            throw e;
        }

        return estadoLista;
    }

}
