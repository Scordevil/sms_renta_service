/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Categoria_TO;
import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.modelo.dto.Servicio_TO;
import co.com.sms.renta.modelo.dto.Usuario_TO;
import co.com.sms.renta.persistencia.dao.ReservacionDAO;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class ReservacionDAOImpl implements ReservacionDAO {

    private final Statement st = ConexionSQL.conexion();
    private Costos_Servicios_TO costosServicios = new Costos_Servicios_TO();
    private Reservacion_TO reservaService = new Reservacion_TO();
    private Servicio_TO servicioModelo = new Servicio_TO();
    private Categoria_TO categoriaModelo = new Categoria_TO();

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
                    + "`idCliente`, `idCiudad_inicio`, `idCiudad_destino`, `idEmpleado`,  `idVehiculo`, `Reservacion_fechaInicio`, `Reservacion_fechaLlegada`,  "
                    + "`Reservacion_horaInicio`,`Reservacion_horaLlegada`,`Reservacion_Costo`,`idCategoria_Servicio`,`idServicio`,`idEstado`) "
                    + " VALUES ('" + reservas.getReserva_Lugar_Inicio() + "', '" + reservas.getReserva_Lugar_Destino() + "' , " + reservas.getIdCliente() + " , "
                    + reservas.getIdCiudad_inicio() + " , " + reservas.getIdCiudad_destino() + " , " + reservas.getIdEmpleado() + "  , " + reservas.getIdVehiculo() + " , '" + reservas.getReserva_fechaInicio() + "' , "
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

    private Reservacion_TO eliminarReseervaHecha(Usuario_TO idCliente, Reservacion_TO idReserva) throws SQLException {

        Reservacion_TO reser = new Reservacion_TO();
        try {
            String sql = "DELETE FROM sms_reservacion "
                    + "WHERE idCliente = " + idCliente.getIdUsuario() + " and "
                    + " idReservacion = " + idReserva.getIdReservacion() + ";";

            st.executeUpdate(sql);
            reser.setMensaje("RESERVACION ELIMINADA CORRECATMENTE");

        } catch (Exception e) {
            reser.setMensaje("ERROR AL ELIMINAR RESERVACION");
            throw e;
        }

        return reser;
    }

    @Override
    public int calcularCostoReservacion(Reservacion_TO reserva, Servicio_TO serv, Categoria_TO cat) throws Exception {

        /*
         1. instanciar la clase simpleFormat.
         2. Definir variables tipo DATE.
         3. Pasar de String a DATE con el metodo para convertir los datos.
         4. Colocar las variables de tipo DATE en los SET de las Variables de Tipo Calendar
         */
        SimpleDateFormat sdft = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha = new Date();
        Date hora = new Date();

        Date fInicio = new Date();
        Date fEntrega = new Date();
        Date hInicio = new Date();
        Date hEntrega = new Date();
        Date hActual = new Date();
        Date fActual = new Date();

        String horaActual;
        String fechaActual;

        try {
            horaActual = sdft.format(hora);
            fechaActual = sdf.format(fecha);

            fInicio = sdf.parse(reserva.getReserva_fechaInicio());
            fEntrega = sdf.parse(reserva.getReserva_fechaLlegada());

            hInicio = sdft.parse(reserva.getReserva_horaInicio());
            hEntrega = sdft.parse(reserva.getReserva_horaLlegada());

            hActual = sdft.parse(horaActual);
            fActual = sdf.parse(fechaActual);

        } catch (ParseException e) {
            e.getMessage();
        }

        //Instacia de variable propias del metodo
        int costo = 0;

        //instancia de objetos relacionados a los DAO necesarios
        Costos_ServiciosDAOImpl cosDao = new Costos_ServiciosDAOImpl();

        // Crear 2 instancias de Calendar
        Calendar calFechaInicio = Calendar.getInstance();
        Calendar calFechaLlegada = Calendar.getInstance();
        Calendar calHoraInicio = Calendar.getInstance();
        Calendar calHoraLlegada = Calendar.getInstance();

        //Variables necesarias para el calculo del costo de la reservacion       
        long milis1;
        long milis2;
        long diff;
        long diffHours;
        long diffDays;
        long diffWeek;
        long diffMonth;
        long diffHourDifferentDay;
        long diffMinutes;

        //asignamos a los objetos calendar la fecha de inicio con la hora de inicio y la fecha de llegada
        //con su hora de llegada
        calFechaInicio.setTime(fInicio);
        calFechaLlegada.setTime(fEntrega);
        calHoraInicio.setTime(hInicio);
        calHoraLlegada.setTime(hEntrega);

        categoriaModelo = cat;
        servicioModelo = serv;

        costosServicios = cosDao.consultarCostosServicio(categoriaModelo, servicioModelo);
        if (servicioModelo.getServicioDuracion() == 0) {
            milis1 = calFechaInicio.getTimeInMillis();
            milis2 = calFechaLlegada.getTimeInMillis();

            // calcular la diferencia en dias
            diff = milis2 - milis1;
            diffDays = diff / (24 * 60 * 60 * 1000);

            milis1 = calHoraInicio.getTimeInMillis();
            milis2 = calHoraLlegada.getTimeInMillis();

            diff = milis1 - milis2;
            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));

            // calcular la diferencia en minutos
            diff = milis2 - milis1;
            diffMinutes = diff / (60 * 1000);

            diffDays = diffHourDifferentDay / 24;

            diffHours = diffHourDifferentDay - (diffDays * 24);

            // calcular la diferencia en horas
            if (servicioModelo.getServicioNombre().equalsIgnoreCase("30 minutos")) {
//                reservaView.getSmsServicios().getServicioNombre().equalsIgnoreCase("30 minutos")
                costo = (((int) diffMinutes) / 30) * costosServicios.getCostoServicio_precio();
            } else if (servicioModelo.getServicioNombre().equalsIgnoreCase("60 minutos")) {
                costo = ((int) diffHours) * costosServicios.getCostoServicio_precio();
            }

        } else if (servicioModelo.getServicioDuracion() < 7 && servicioModelo.getServicioDuracion() >= 1) {//Renta por dias

            milis1 = calFechaInicio.getTimeInMillis();
            milis2 = calFechaLlegada.getTimeInMillis();

            // calcular la diferencia en dias
            diff = milis2 - milis1;
            diffDays = diff / (24 * 60 * 60 * 1000);

            milis1 = calHoraInicio.getTimeInMillis();
            milis2 = calHoraLlegada.getTimeInMillis();

            diff = milis1 - milis2;
            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));

            diffDays = diffHourDifferentDay / 24;

            // calcular la diferencia en horas
            diffHours = diffHourDifferentDay - (diffDays * 24);

            costo = ((int) diffDays) * costosServicios.getCostoServicio_precio();

            if ((int) diffHours > 4) {
                //Obtenemos el costo de la hora
                costo = costo + (costosServicios.getCostoServicio_precio() / 2);
            } else if ((int) diffHours > 12) {
                costo = costo + (costosServicios.getCostoServicio_precio());
            }
        } else if (servicioModelo.getServicioDuracion() >= 7 && servicioModelo.getServicioDuracion() < 30) {

            // conseguir la representacion de la fecha en milisegundos
            milis1 = calFechaInicio.getTimeInMillis();
            milis2 = calFechaLlegada.getTimeInMillis();

            // calcular la diferencia en dias
            diff = milis2 - milis1;
            diffDays = (diff / (24 * 60 * 60 * 1000));
            diffWeek = diffDays / 7;

            costo = ((int) diffWeek) * costosServicios.getCostoServicio_precio();

            diffDays = diffDays - (diffWeek * 7);

            milis1 = calHoraInicio.getTimeInMillis();
            milis2 = calHoraLlegada.getTimeInMillis();

            diff = milis1 - milis2;
            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));

            diffDays = diffHourDifferentDay / 24;

            //Calculamos costo del dia
            if ((int) diffDays > 2) {
                costo = costo + ((costosServicios.getCostoServicio_precio()) / 2);
            } else if ((int) diffDays > 4) {
                costo = costo + ((costosServicios.getCostoServicio_precio()));
            }

        } else if (servicioModelo.getServicioDuracion() >= 30) {

            // conseguir la representacion de la fecha en milisegundos
            int diaInicio = fInicio.getDate();
            int diaEntrega = fEntrega.getDay();

            // calcular la diferencia en dias
            diffDays = diaEntrega - diaInicio;

            int startMes = (calFechaInicio.get(Calendar.YEAR) * 12) + calFechaInicio.get(Calendar.MONTH);
            int endMes = (calFechaLlegada.get(Calendar.YEAR) * 12) + calFechaLlegada.get(Calendar.MONTH);

            int daysInMonth = calFechaInicio.getActualMaximum(Calendar.DAY_OF_MONTH);

            milis1 = calHoraInicio.getTimeInMillis();
            milis2 = calHoraLlegada.getTimeInMillis();

            diff = milis1 - milis2;
            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));

            diffDays = diffHourDifferentDay / 24;

            //Diferencia en meses entre las dos fechas
            diffMonth = endMes - startMes;
            costo = ((int) diffMonth) * costosServicios.getCostoServicio_precio();

            if ((int) diffDays < 7) {
                costo = costo + (costosServicios.getCostoServicio_precio() / 4);
            } else if ((int) diffDays > 7 && (int) diffDays < 15) {
                costo = costo + (costosServicios.getCostoServicio_precio() / 3);
            } else if ((int) diffDays > 15 && (int) diffDays < 21) {
                costo = costo + (costosServicios.getCostoServicio_precio() / 2);
            } else if ((int) diffDays > 29) {
                costo = costo + (costosServicios.getCostoServicio_precio());
            }

        }
        return costo;

    }

    @Override
    public List<Reservacion_TO> consultarReservasConductor(Usuario_TO conductor) throws Exception {

        List<Reservacion_TO> reservasClientes = new ArrayList<>();

        try {
            reservasClientes = todaReservaCOnductor(conductor);

        } catch (Exception e) {
            throw e;
        }

        return reservasClientes;
    }

    private List<Reservacion_TO> todaReservaCOnductor(Usuario_TO cond) throws SQLException {
        List<Reservacion_TO> reserClie = new ArrayList<>();

        String sql = " SELECT `idReservacion`, `Reservacion_lugar_llegada`, `Reservacion_lugar_destino`, "
                + " `Reservacion_notas`, `idCliente`, `idCiudad_inicio`, `idCiudad_destino`, "
                + " `idEmpleado` ,  `idVehiculo`, `Reservacion_fechaInicio`, `Reservacion_fechaLlegada`, "
                + " `Reservacion_horaInicio`, `Reservacion_horaLlegada`, `Reservacion_Costo`, "
                + " `idCategoria_Servicio`, `idServicio` , `idEstado` "
                + " FROM `sms_reservacion` "
                + " WHERE `idEmpleado` = " + cond.getIdEmpleado() + " ";

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

}
