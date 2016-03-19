/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.VehiculoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SISTEMAS
 */
public class VehiculoDAOImpl implements VehiculoDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Vehiculo_TO editarEstadoVehiculo(Vehiculo_TO vehiculo) throws Exception {

//        Usuario_TO user = new Usuario_TO();
        Vehiculo_TO veh = new Vehiculo_TO();

        try {

            String sql = "UPDATE `sms_vehiculo` "
                    + "  SET `idEstado` = " + vehiculo.getIdEstado() + "  "
                    + "  WHERE `idVehiculo` = " + vehiculo.getIdVehiculo() + " ;";

            st.executeUpdate(sql);

            // LLAMA AL MÉTODO
            veh.setMensaje("Usuario registrado correctamente");

        } catch (Exception e) {

            veh = new Vehiculo_TO();
            veh.setMensaje("Usuario no registrado");
            throw e;

        }

        return veh;
    }

}
