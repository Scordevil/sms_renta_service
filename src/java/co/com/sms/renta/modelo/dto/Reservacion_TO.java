/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Reservación
 *
 * Tabla Relacionada sms_reservacion
 *
 * @author SISTEMAS
 */
@XmlRootElement
public class Reservacion_TO {

    /**
     *
     * Columna idReservacion
     */
    private int idReservacion;

    /**
     *
     * Columna Reservacion_lugar_llegada
     */
    private String reserva_Lugar_Llegada;

    /**
     *
     * Columna Reservacion_lugar_destino
     */
    private String reserva_Lugar_Destino;

    /**
     *
     * Columna Reservacion_notas
     */
    private String reserva_Notas;

    /**
     *
     * Columna idCliente
     */
    private int idCliente;

    /**
     *
     * Columna idCiudad_inicio
     */
    private int idCiudad_inicio;

    /**
     *
     * Columna idCiudad_destino
     */
    private int idCiudad_destino;

    /**
     *
     * Columna idEmpleado
     */
    private int idEmpleado;

    /**
     *
     * Columna idVehiculo
     */
    private int idVehiculo;

    /**
     *
     * Columna Reservacion_fechaInicio
     */
    private String reserva_fechaInicio;

    /**
     *
     * Columna Reservacion_fechaLlegada
     */
    private String reserva_fechaLlegada;

    /**
     *
     * Columna Reservacion_horaInicio
     */
    private String reserva_horaInicio;

    /**
     *
     * Columna Reservacion_horaLlegada
     */
    private String reserva_horaLlegada;

    /**
     *
     * Columna Reservacion_Costo
     */
    private int reservacion_Costo;

    /**
     *
     * Columna idCategoria_Servicio
     */
    private int idCategoria_Servicio;

    /**
     *
     * Columna idServicio
     */
    private int idServicio;

    /**
     *
     * Columna idEstado
     */
    private int idEstado;

    /**
     *
     * String de consulta de registro
     */
    private String mensaje;

    public Reservacion_TO() {
    }

    public Reservacion_TO(int idReservacion, String reserva_Lugar_Llegada, String reserva_Lugar_Destino, String reserva_Notas, int idCliente, int idCiudad_inicio, int idCiudad_destino, int idEmpleado, int idVehiculo, String reserva_fechaInicio, String reserva_fechaLlegada, String reserva_horaInicio, String reserva_horaLlegada, int reservacion_Costo, int idCategoria_Servicio, int idServicio, int idEstado, String mensaje) {
        this.idReservacion = idReservacion;
        this.reserva_Lugar_Llegada = reserva_Lugar_Llegada;
        this.reserva_Lugar_Destino = reserva_Lugar_Destino;
        this.reserva_Notas = reserva_Notas;
        this.idCliente = idCliente;
        this.idCiudad_inicio = idCiudad_inicio;
        this.idCiudad_destino = idCiudad_destino;
        this.idEmpleado = idEmpleado;
        this.idVehiculo = idVehiculo;
        this.reserva_fechaInicio = reserva_fechaInicio;
        this.reserva_fechaLlegada = reserva_fechaLlegada;
        this.reserva_horaInicio = reserva_horaInicio;
        this.reserva_horaLlegada = reserva_horaLlegada;
        this.reservacion_Costo = reservacion_Costo;
        this.idCategoria_Servicio = idCategoria_Servicio;
        this.idServicio = idServicio;
        this.idEstado = idEstado;
        this.mensaje = mensaje;
    }

//    CONSTRUCTOR PARA RECIVIR DATOS EN EL SERVICIO
    public Reservacion_TO(String reserva_fechaInicio, String reserva_fechaLlegada, String reserva_horaInicio, String reserva_horaLlegada) {
        this.reserva_fechaInicio = reserva_fechaInicio;
        this.reserva_fechaLlegada = reserva_fechaLlegada;
        this.reserva_horaInicio = reserva_horaInicio;
        this.reserva_horaLlegada = reserva_horaLlegada;
    }
    
//    REGISTRAR RESERVAS

    public Reservacion_TO(String reserva_Lugar_Llegada, String reserva_Lugar_Destino, String reserva_Notas, int idCliente, int idCiudad_inicio, int idCiudad_destino, int idEmpleado, int idVehiculo, String reserva_fechaInicio, String reserva_fechaLlegada, String reserva_horaInicio, String reserva_horaLlegada, int reservacion_Costo, int idCategoria_Servicio, int idServicio, int idEstado) {
        this.reserva_Lugar_Llegada = reserva_Lugar_Llegada;
        this.reserva_Lugar_Destino = reserva_Lugar_Destino;
        this.reserva_Notas = reserva_Notas;
        this.idCliente = idCliente;
        this.idCiudad_inicio = idCiudad_inicio;
        this.idCiudad_destino = idCiudad_destino;
        this.idEmpleado = idEmpleado;
        this.idVehiculo = idVehiculo;
        this.reserva_fechaInicio = reserva_fechaInicio;
        this.reserva_fechaLlegada = reserva_fechaLlegada;
        this.reserva_horaInicio = reserva_horaInicio;
        this.reserva_horaLlegada = reserva_horaLlegada;
        this.reservacion_Costo = reservacion_Costo;
        this.idCategoria_Servicio = idCategoria_Servicio;
        this.idServicio = idServicio;
        this.idEstado = idEstado;
    }
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getReserva_Lugar_Llegada() {
        return reserva_Lugar_Llegada;
    }

    public void setReserva_Lugar_Llegada(String reserva_Lugar_Llegada) {
        this.reserva_Lugar_Llegada = reserva_Lugar_Llegada;
    }

    public String getReserva_Lugar_Destino() {
        return reserva_Lugar_Destino;
    }

    public void setReserva_Lugar_Destino(String reserva_Lugar_Destino) {
        this.reserva_Lugar_Destino = reserva_Lugar_Destino;
    }

    public String getReserva_Notas() {
        return reserva_Notas;
    }

    public void setReserva_Notas(String reserva_Notas) {
        this.reserva_Notas = reserva_Notas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCiudad_inicio() {
        return idCiudad_inicio;
    }

    public void setIdCiudad_inicio(int idCiudad_inicio) {
        this.idCiudad_inicio = idCiudad_inicio;
    }

    public int getIdCiudad_destino() {
        return idCiudad_destino;
    }

    public void setIdCiudad_destino(int idCiudad_destino) {
        this.idCiudad_destino = idCiudad_destino;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getReserva_fechaInicio() {
        return reserva_fechaInicio;
    }

    public void setReserva_fechaInicio(String reserva_fechaInicio) {
        this.reserva_fechaInicio = reserva_fechaInicio;
    }

    public String getReserva_fechaLlegada() {
        return reserva_fechaLlegada;
    }

    public void setReserva_fechaLlegada(String reserva_fechaLlegada) {
        this.reserva_fechaLlegada = reserva_fechaLlegada;
    }

    public String getReserva_horaInicio() {
        return reserva_horaInicio;
    }

    public void setReserva_horaInicio(String reserva_horaInicio) {
        this.reserva_horaInicio = reserva_horaInicio;
    }

    public String getReserva_horaLlegada() {
        return reserva_horaLlegada;
    }

    public void setReserva_horaLlegada(String reserva_horaLlegada) {
        this.reserva_horaLlegada = reserva_horaLlegada;
    }

    public int getReservacion_Costo() {
        return reservacion_Costo;
    }

    public void setReservacion_Costo(int reservacion_Costo) {
        this.reservacion_Costo = reservacion_Costo;
    }

    public int getIdCategoria_Servicio() {
        return idCategoria_Servicio;
    }

    public void setIdCategoria_Servicio(int idCategoria_Servicio) {
        this.idCategoria_Servicio = idCategoria_Servicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return "Reservacion_TO{" + "idReservacion=" + idReservacion + ", reserva_Lugar_Llegada=" + reserva_Lugar_Llegada + ", reserva_Lugar_Destino=" + reserva_Lugar_Destino + ", reserva_Notas=" + reserva_Notas + ", idCliente=" + idCliente + ", idCiudad_inicio=" + idCiudad_inicio + ", idCiudad_destino=" + idCiudad_destino + ", idEmpleado=" + idEmpleado + ", idVehiculo=" + idVehiculo + ", reserva_fechaInicio=" + reserva_fechaInicio + ", reserva_fechaLlegada=" + reserva_fechaLlegada + ", reserva_horaInicio=" + reserva_horaInicio + ", reserva_horaLlegada=" + reserva_horaLlegada + ", reservacion_Costo=" + reservacion_Costo + ", idCategoria_Servicio=" + idCategoria_Servicio + ", idServicio=" + idServicio + ", idEstado=" + idEstado + ", mensaje=" + mensaje + '}';
    }

    
    
}
