/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Costos_Servicios_TO;
import co.com.sms.renta.modelo.dto.Reservacion_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface Costos_ServiciosDAO {

    public Costos_Servicios_TO consultarCostosServicio (Costos_Servicios_TO costosServicios, Reservacion_TO reserva )throws Exception;
    public Costos_Servicios_TO consultarCostoLugar (Costos_Servicios_TO costoLugar) throws Exception;
    public List<Costos_Servicios_TO> consultarCostosTurismo ()throws Exception;
}
