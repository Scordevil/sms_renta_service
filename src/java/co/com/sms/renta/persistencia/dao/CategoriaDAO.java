/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.persistencia.dao;

import co.com.sms.renta.modelo.dto.Categoria_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad Categoria
 * 
 * @author SISTEMAS
 */
public interface CategoriaDAO {
    
    public List<Categoria_TO> consultarCategorias(Categoria_TO cat) throws Exception;
    
}
