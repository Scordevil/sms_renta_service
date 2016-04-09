/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.servicio.impl;

import co.com.sms.renta.modelo.dto.Estado_TO;
import co.com.sms.renta.persistencia.dao.impl.EstadoDAOImpl;
import co.com.sms.renta.servicio.ConsultarEstadosReservas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class ConsultarEstadosReservasImpl implements ConsultarEstadosReservas{

    @Override
    public List<Estado_TO> consultarEstadosReservas() throws Exception {
        
        List<Estado_TO> estadosLista = new ArrayList<>();
        
        EstadoDAOImpl estadoDAO = new EstadoDAOImpl();
        
        estadosLista = estadoDAO.consultarEstadosRestantes();
        
        return estadosLista;
    }
    
}
