/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.ReservacionDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class ReservacionDAOImpl implements ReservacionDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Reservacion_TO registrarReserva(Reservacion_TO reserva) throws Exception {

        Reservacion_TO reser = new Reservacion_TO();
        try {
            reser = todasLasReservaciones(reserva);

        } catch (Exception e) {
            throw e;
        }

        return reser;
    }

    public Reservacion_TO todasLasReservaciones(Reservacion_TO reservas) throws SQLException {

        Reservacion_TO reser = new Reservacion_TO();

        try {
            String sql = "INSERT INTO `sms_reservacion` ( `Reservacion_lugar_llegada`, `Reservacion_lugar_destino`, "
                    + "`idCliente`, `idCiudad_inicio`, `idVehiculo`, `Reservacion_fechaInicio`, `Reservacion_fechaLlegada`,  "
                    + "`Reservacion_horaInicio`,`Reservacion_horaLlegada`,`Reservacion_Costo`,`idCategoria_Servicio`,`idServicio`,`idEstado`) "
                    + " VALUES ('" + reservas.getReserva_Lugar_Llegada() + "', '" + reservas.getReserva_Lugar_Destino() + "' , " + reservas.getIdCliente() + " , "
                    + reservas.getIdCiudad_inicio() + " , " + reservas.getIdVehiculo() + " , '" + reservas.getReserva_fechaInicio() + "' , "
                    + " '" + reservas.getReserva_fechaLlegada() + "',  '" + reservas.getReserva_horaInicio() + "', '" + reservas.getReserva_horaLlegada() + "', "
                    + reservas.getReservacion_Costo() + " , " + reservas.getIdCategoria_Servicio() + " , " + reservas.getIdServicio() + " , " + reservas.getIdEstado() + " )";

            st.execute(sql);
            reser.setMensaje("RESERVA REGISTRADA CORRECTAMENTE");

        } catch (Exception e) {
            Reservacion_TO resera = new Reservacion_TO();
            resera.setMensaje("Reserva no registrada");
            throw e;
        }
        return reser;
    }

    @Override
    public List<Reservacion_TO> consultarReservasClientes(Usuario_TO cliente) throws Exception {

        List<Reservacion_TO> reservasClientes = new ArrayList<>();

        try {
            reservasClientes = todaReservaClientes(cliente);

        } catch (Exception e) {
            throw e;
        }

        return reservasClientes;
    }

    private List<Reservacion_TO> todaReservaClientes(Usuario_TO client) throws SQLException {
        List<Reservacion_TO> reserClie = new ArrayList<>();

        String sql = " Select `idReservacion`, `Reservacion_lugar_llegada`, `Reservacion_lugar_destino`, "
                + " `Reservacion_notas`, `idCliente`, `idCiudad_inicio`, `idCiudad_destino`, "
                + " `idEmpleado`,  `idVehiculo`, `Reservacion_fechaInicio`, `Reservacion_fechaLlegada`, "
                + " `Reservacion_horaInicio`, `Reservacion_horaLlegada`, `Reservacion_Costo`, "
                + " `idCategoria_Servicio`, `idServicio`,`idEstado` "
                + " from sms_reservacion "
                + " where idCliente = " + client.getIdUsuario() + " ";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            reserClie.add(new Reservacion_TO(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7),
                    rs.getInt(8),
                    rs.getInt(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getInt(14),
                    rs.getInt(15),
                    rs.getInt(16),
                    rs.getInt(17)));
        }

        return reserClie;
    }

    @Override
    public Reservacion_TO eliminarReserva(Usuario_TO cliente, Reservacion_TO reserva) throws Exception {

        Reservacion_TO eliReser = new Reservacion_TO();

        try {
            eliReser = eliminarReseervaHecha(cliente, reserva);

        } catch (Exception e) {
            eliReser = new Reservacion_TO();
            
            throw e;
        }
        return eliReser;
    }

    private Reservacion_TO eliminarReseervaHecha(Usuario_TO idCliente ,Reservacion_TO idReserva) throws SQLException {

        Reservacion_TO reser = new Reservacion_TO();
        try {
            String sql = "DELETE FROM sms_reservacion "
                    + "WHERE idCliente = "+ idCliente.getIdUsuario() +" and "
                    + " idReservacion = " + idReserva.getIdReservacion() + ";";

            st.executeUpdate(sql);
            reser.setMensaje("RESERVACION ELIMINADA CORRECATMENTE");

        } catch (Exception e) {
            reser.setMensaje("ERROR AL ELIMINAR RESERVACION");
            throw e;
        }

        return reser;
    }
}