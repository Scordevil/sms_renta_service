/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio;

import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarCostoLugar {
    public Costos_Servicios_TO ConsultarCostoLugar (int idServicio, int idCategoria, int idLugarInicio , int idLugarDestino) throws Exception;
}
