/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Estado_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface EstadoDAO {
    public List<Estado_TO> consultarEstados()throws Exception;
    public List<Estado_TO> consultarEstadosRestantes()throws Exception;
}
