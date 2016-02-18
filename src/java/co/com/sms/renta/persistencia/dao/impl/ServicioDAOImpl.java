/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao.impl;

import co.com.sms.renta.conexion.ConexionSQL;
import co.com.sms.renta.modelo.dto.Servicio_TO;
import co.com.sms.renta.persistencia.dao.ServicioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class ServicioDAOImpl implements ServicioDAO{
    
    private final Statement st = ConexionSQL.conexion();
    
    /**
     *
     * @return @throws Exception
     */
    
    @Override
    public List<Servicio_TO> consultarServicios() throws Exception{
        
        Statement st = ConexionSQL.conexion();
        List<Servicio_TO> servicios = new ArrayList<>();
        
        try{
            servicios = consultarTodosServicios();
        }
        catch(Exception e){
            throw e;
        }
        return servicios;
    }
    
    
    private List<Servicio_TO> consultarTodosServicios() throws SQLException{
        
            //        seleccionar todos los registros
        String sql = " Select s.idServicios, s.Servicios_nombre, s.Servicios_descripcion "
                   + "from sms_servicios as s ";
        
        ResultSet rs = st.executeQuery(sql);
        
        //llama al metodo       
        final List<Servicio_TO> servicios = new ArrayList<>();
        while (rs.next()) {
            
            servicios.add(new Servicio_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        
        return servicios;
    }
    
    
}
