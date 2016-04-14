/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import co.com.sms.renta.persistencia.dao.Costos_ServiciosDAO;
import static java.lang.System.console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SISTEMAS
 */
public class Costos_ServiciosDAOImpl implements Costos_ServiciosDAO {

    private final Statement st = ConexionSQL.conexion();
    Costos_Servicios_TO costosServicio = new Costos_Servicios_TO();

    public Costos_Servicios_TO consultarCostosServicio(Costos_Servicios_TO costosServicios, Reservacion_TO reserva) throws Exception {

        try {

            costosServicio = todosLosCostosServicios(costosServicios, reserva);

        } catch (Exception e) {
            throw e;
        }
        return costosServicio;
    }

    private Costos_Servicios_TO todosLosCostosServicios(Costos_Servicios_TO costosServicios, Reservacion_TO reserva) throws SQLException, Exception {

        Costos_Servicios_TO costo = new Costos_Servicios_TO();
        Costos_Servicios_TO costoTotal = new Costos_Servicios_TO();

        try {

            String sql = "SELECT idCostosServicio, idServicio, idCategoria,CostoServicio_precio,idLugar_inicio,idLugar_destino FROM `sms_costosservicios` "
                    + "where idServicio = " + costosServicios.getIdServicio() + " and idCategoria = " + costosServicios.getIdCategoria();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                costo = new Costos_Servicios_TO(rs.getInt(1), rs.getInt(2),
                        rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));

            }
        } catch (Exception e) {
            throw e;
        }

        costoTotal = calcularCostoReservacion(reserva, costo);
        ConexionSQL.CerrarConexion();
        return costoTotal;
    }

    public Costos_Servicios_TO calcularCostoReservacion(Reservacion_TO reserva, Costos_Servicios_TO costosServicios) throws Exception {

        System.out.print("Gustavo" + costosServicios.getCostoServicio_precio());

        Costos_Servicios_TO costos = new Costos_Servicios_TO();
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

//        if (servicioModelo.getServicioDuracion() == 0) {
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
        if (costosServicios.getIdServicio() == 10) { //30 minutos
//                reservaView.getSmsServicios().getServicioNombre().equalsIgnoreCase("30 minutos")
            System.out.print("------------1---------" + reserva.getIdServicio());
            costo = (((int) diffMinutes) / 30) * costosServicios.getCostoServicio_precio();
        } else if (reserva.getIdServicio() == 11) { //60 minutos
            System.out.print("-----------2----------" + reserva.getIdServicio());
            costo = ((int) diffHours) * costosServicios.getCostoServicio_precio();
        }

        costosServicios.setCostoServicio_precio(costo);

//        } else if (servicioModelo.getServicioDuracion() < 7 && servicioModelo.getServicioDuracion() >= 1) {//Renta por dias
//
//            milis1 = calFechaInicio.getTimeInMillis();
//            milis2 = calFechaLlegada.getTimeInMillis();
//
//            // calcular la diferencia en dias
//            diff = milis2 - milis1;
//            diffDays = diff / (24 * 60 * 60 * 1000);
//
//            milis1 = calHoraInicio.getTimeInMillis();
//            milis2 = calHoraLlegada.getTimeInMillis();
//
//            diff = milis1 - milis2;
//            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));
//
//            diffDays = diffHourDifferentDay / 24;
//
//            // calcular la diferencia en horas
//            diffHours = diffHourDifferentDay - (diffDays * 24);
//
//            costo = ((int) diffDays) * costosServicios.getCostoServicio_precio();
//
//            if ((int) diffHours > 4) {
//                //Obtenemos el costo de la hora
//                costo = costo + (costosServicios.getCostoServicio_precio() / 2);
//            } else if ((int) diffHours > 12) {
//                costo = costo + (costosServicios.getCostoServicio_precio());
//            }
//        } else if (servicioModelo.getServicioDuracion() >= 7 && servicioModelo.getServicioDuracion() < 30) {
//
//            // conseguir la representacion de la fecha en milisegundos
//            milis1 = calFechaInicio.getTimeInMillis();
//            milis2 = calFechaLlegada.getTimeInMillis();
//
//            // calcular la diferencia en dias
//            diff = milis2 - milis1;
//            diffDays = (diff / (24 * 60 * 60 * 1000));
//            diffWeek = diffDays / 7;
//
//            costo = ((int) diffWeek) * costosServicios.getCostoServicio_precio();
//
//            diffDays = diffDays - (diffWeek * 7);
//
//            milis1 = calHoraInicio.getTimeInMillis();
//            milis2 = calHoraLlegada.getTimeInMillis();
//
//            diff = milis1 - milis2;
//            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));
//
//            diffDays = diffHourDifferentDay / 24;
//
//            //Calculamos costo del dia
//            if ((int) diffDays > 2) {
//                costo = costo + ((costosServicios.getCostoServicio_precio()) / 2);
//            } else if ((int) diffDays > 4) {
//                costo = costo + ((costosServicios.getCostoServicio_precio()));
//            }
//
//        } else if (servicioModelo.getServicioDuracion() >= 30) {
//
//            // conseguir la representacion de la fecha en milisegundos
//            int diaInicio = fInicio.getDate();
//            int diaEntrega = fEntrega.getDay();
//
//            // calcular la diferencia en dias
//            diffDays = diaEntrega - diaInicio;
//
//            int startMes = (calFechaInicio.get(Calendar.YEAR) * 12) + calFechaInicio.get(Calendar.MONTH);
//            int endMes = (calFechaLlegada.get(Calendar.YEAR) * 12) + calFechaLlegada.get(Calendar.MONTH);
//
//            int daysInMonth = calFechaInicio.getActualMaximum(Calendar.DAY_OF_MONTH);
//
//            milis1 = calHoraInicio.getTimeInMillis();
//            milis2 = calHoraLlegada.getTimeInMillis();
//
//            diff = milis1 - milis2;
//            diffHourDifferentDay = (diffDays * 24) - (diff / (60 * 60 * 1000));
//
//            diffDays = diffHourDifferentDay / 24;
//
//            //Diferencia en meses entre las dos fechas
//            diffMonth = endMes - startMes;
//            costo = ((int) diffMonth) * costosServicios.getCostoServicio_precio();
//
//            if ((int) diffDays < 7) {
//                costo = costo + (costosServicios.getCostoServicio_precio() / 4);
//            } else if ((int) diffDays > 7 && (int) diffDays < 15) {
//                costo = costo + (costosServicios.getCostoServicio_precio() / 3);
//            } else if ((int) diffDays > 15 && (int) diffDays < 21) {
//                costo = costo + (costosServicios.getCostoServicio_precio() / 2);
//            } else if ((int) diffDays > 29) {
//                costo = costo + (costosServicios.getCostoServicio_precio());
//            }
        //       }
        return costosServicios;

    }

    @Override
    public Costos_Servicios_TO consultarCostoLugar(Costos_Servicios_TO costoLugar) throws Exception {
        Costos_Servicios_TO costoL = new Costos_Servicios_TO();
        costoL = todosLosCostosLugares(costoLugar);
        return costoL;
    }

    private Costos_Servicios_TO todosLosCostosLugares(Costos_Servicios_TO costoLugar) throws SQLException {
        String sql = "SELECT `idCostosServicio` , `idServicio` , `idCategoria` , "
                + " `CostoServicio_precio` , `idLugar_inicio` , `idLugar_destino` "
                + " FROM `sms_costosservicios` WHERE `idLugar_inicio` = " + costoLugar.getIdLugar_inicio() + " AND "
                + " `idLugar_destino` = " + costoLugar.getIdLugar_destino() + " AND "
                + " `idServicio` = " + costoLugar.getIdServicio() + " AND "
                + " `idCategoria` = " + costoLugar.getIdCategoria() + " ";
        ResultSet rs = st.executeQuery(sql);
        Costos_Servicios_TO cost = new Costos_Servicios_TO();
        while (rs.next()) {
            cost = new Costos_Servicios_TO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
        }
        return cost;
    }

}
