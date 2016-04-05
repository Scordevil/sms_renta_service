/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Categoria_TO;
import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.modelo.dto.Servicio_TO;
import co.com.sms.renta.persistencia.dao.Costos_ServiciosDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author SISTEMAS
 */
public class Costos_ServiciosDAOImpl implements Costos_ServiciosDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Costos_Servicios_TO consultarCostosServicio(Categoria_TO cat, Servicio_TO servicio) throws Exception {

        Costos_Servicios_TO costosServicios = new Costos_Servicios_TO();

        try {

            costosServicios = todosLosCostosServicios(cat, servicio);

        } catch (Exception e) {
            throw e;
        }
        return costosServicios;
    }

    private Costos_Servicios_TO todosLosCostosServicios(Categoria_TO categoria, Servicio_TO services) throws SQLException {

        Costos_Servicios_TO costosLista = new Costos_Servicios_TO();

        try {
            String sql = "SELECT * FROM `sms_costosservicios` WHERE `idCategoria` = "
                    + categoria.getIdCategoria() + " AND `idServicio` = " + services.getIdServicios() + " ";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                costosLista = new Costos_Servicios_TO(rs.getInt(1), rs.getInt(2),
                        rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));

            }

        } catch (Exception e) {
            throw e;
        }

        return costosLista;
    }

}
