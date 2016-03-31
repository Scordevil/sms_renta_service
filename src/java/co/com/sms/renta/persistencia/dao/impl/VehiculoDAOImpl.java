/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Vehiculo_TO;
import co.com.sms.renta.persistencia.dao.VehiculoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.component.UIComponent;

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

    @Override
    public List<Vehiculo_TO> consultarVehiculo() throws Exception {

        Statement st = ConexionSQL.conexion();
        List<Vehiculo_TO> vehiculos = new ArrayList<>();
        try {

            vehiculos = consultarTodoslosVehiculos();

        } catch (Exception e) {
            throw e;
        }

        return vehiculos;
    }

    private List<Vehiculo_TO> consultarTodoslosVehiculos() throws SQLException {

        String sql = "SELECT v.idVehiculo , v.Veh_placa , v.Veh_modelo , cat.Categoria_nombre , "
                + " r.Referencia_nombre , v.Veh_num_personas , v.Veh_num_malGrande , v.Veh_num_malPequeña , "
                + " c.Ciudad_nombre , v.idProveedor , v.Veh_foto_nombre , v.Veh_foto_ruta , v.Veh_foto2_nombre , "
                + " v.Veh_foto2_ruta , color.Color_nombre , e.Estado_nombre "
                + " FROM `sms_vehiculo` as v, `sms_marca` as m , `sms_ciudad` as c , `sms_color` as color , "
                + " `sms_proveedor` as p , `sms_categoria` as cat , `sms_referencia` as r , `sms_estado` as e "
                + " WHERE v.idCategoria = cat.idCategoria AND\n"
                + "	  v.idCiudad = c.idCiudad AND\n"
                + "       v.idReferencia = r.idReferencia AND\n"
                + "       v.idProveedor = p.idProveedor AND\n"
                + "       r.Referencia_idMarca = m.idMarca AND\n"
                + "       v.idEstado = 1 ";
//      PENDIENTE AL CAMBIO SEGUN LA RESERVACION QUE SE VAYA A REALIZAR
//                + "      v.idEstado = " + vehiculo.getIdEstado() +" ";
        ResultSet rs = st.executeQuery(sql);

        final List<Vehiculo_TO> vehiculos = new ArrayList<Vehiculo_TO>();

        while (rs.next()) {
            vehiculos.add(new Vehiculo_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12),
                    rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
        }

        return vehiculos;
    }

    @Override
    public List<Vehiculo_TO> consultarVehiculosDisponibles(Reservacion_TO reservacion) throws Exception {
        
            
        
        String sql = "SELECT v.idVehiculo , v.Veh_placa , v.Veh_modelo , cat.Categoria_nombre , "
                + " r.Referencia_nombre , v.Veh_num_personas , v.Veh_num_malGrande , v.Veh_num_malPequeña , "
                + " c.Ciudad_nombre , v.idProveedor , v.Veh_foto_nombre , v.Veh_foto_ruta , v.Veh_foto2_nombre , "
                + " v.Veh_foto2_ruta , color.Color_nombre , e.Estado_nombre  "
                + " FROM `sms_vehiculo` as v, `sms_marca` as m , `sms_ciudad` as c , `sms_color` as color , "
                + "  `sms_proveedor` as p , `sms_categoria` as cat , `sms_referencia` as r , `sms_estado` as e "
                + "  WHERE v.idCategoria = cat.idCategoria AND "
                + "    v.idCiudad = c.idCiudad AND "
                + "    v.idReferencia = r.idReferencia AND "
                + "    v.idProveedor = p.idProveedor AND "
                + "    r.Referencia_idMarca = m.idMarca AND "
                + "    v.idEstado = 1 AND   "
                + "    v.idVehiculo <> ALL ( "
                //                PRIMER VALIDACION DE LA DISPONIBILIDAD DE VEHICULO
                + " SELECT r.idVehiculo FROM `sms_reservacion` as r "
                //                SEGUNDA VALIDACION DE LA DISPONIBILIDAD DE VEHICULO
                + "    WHERE r.idVehiculo <> v.idVehiculo OR "
                //                TERCERA VALIDACION DE LA DISPONIBILIDAD DE VEHICULO
                + "     r.Reservacion_fechaInicio <> " + reservacion.getReserva_fechaInicio() + " AND "
                + "     r.Reservacion_fechaLlegada <> " + reservacion.getReserva_fechaLlegada() + " AND "
                + "     r.Reservacion_horaInicio <> '" + reservacion.getReserva_horaInicio() + "' AND "
                + "     r.Reservacion_horaLlegada  <> '" + reservacion.getReserva_horaLlegada() + "'  "
                + "	AND "
                //                CUARTA VALIDACION DE LA DISPONIBILIDAD DE VEHICULO
                + "     r.idVehiculo = v.idVehiculo AND "
                + "     r.Reservacion_fechaInicio BETWEEN ( " + reservacion.getReserva_fechaInicio() + " AND r.Reservacion_fechaLlegada ) AND "
                + "     r.Reservacion_fechaLlegada BETWEEN ( r.Reservacion_fechaInicio AND " + reservacion.getReserva_fechaLlegada() + " ) AND  "
                + "     r.Reservacion_horaInicio BETWEEN ('" + reservacion.getReserva_horaInicio() + "' AND r.Reservacion_horaLlegada) AND  "
                + "     r.Reservacion_horaLlegada  BETWEEN '" + reservacion.getReserva_horaLlegada() + "' AND r.Reservacion_horaInicio) GROUP BY v.idVehiculo";

        ResultSet rs = st.executeQuery(sql);

        final List<Vehiculo_TO> vehiculos = new ArrayList<Vehiculo_TO>();

        while (rs.next()) {
            vehiculos.add(new Vehiculo_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12),
                    rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
        }

        return vehiculos;
    }
}
