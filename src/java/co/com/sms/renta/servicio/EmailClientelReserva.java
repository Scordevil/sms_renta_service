/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.config.SendEmail;

/**
 *
 * @author SISTEMAS
 */
public interface EmailClientelReserva {
    
    public SendEmail envioEmailClienteReserva (String usuarioEmail,   
            String usuarioNombre,
            String marcaNombre, 
            String referenciaNombre,
            String reserva_Lugar_Inicio,
            String reserva_Lugar_Destino,
            String reserva_Fecha_Inico, 
            String reserva_Hora_Inicio, 
            String nombre_Ciudad_Inicio, 
            int reserva_Costo) throws Exception ;
}
