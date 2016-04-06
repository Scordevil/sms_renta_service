/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios de un modelo Cstos_Servicios
 *
 * Tabla Relacionada sms_costosServicios
 *
 * @author sms
 */
@XmlRootElement
public class Costos_Servicios_TO {

    /**
     *
     * Columna idCostosServicio
     */
    private int idCostosServicio;

    /**
     *
     * Columna idServicio
     */
    private int idServicio;

    /**
     *
     * Columna idCategoria
     */
    private int idCategoria;

    /**
     *
     * Columna CostoServicio_precio
     */
    private int costoServicio_precio;

    /**
     *
     * Columna idLugar_inicio
     */
    private int idLugar_inicio;

    /**
     *
     * Columna idLugar_destino
     */
    private int idLugar_destino;

    public Costos_Servicios_TO() {
    }

    public Costos_Servicios_TO(int idCostosServicio, int idServicio, int idCategoria, int costoServicio_precio, int idLugar_inicio, int idLugar_destino) {
        this.idCostosServicio = idCostosServicio;
        this.idServicio = idServicio;
        this.idCategoria = idCategoria;
        this.costoServicio_precio = costoServicio_precio;
        this.idLugar_inicio = idLugar_inicio;
        this.idLugar_destino = idLugar_destino;
    }

    public Costos_Servicios_TO(int idServicio, int idCategoria) {
        this.idServicio = idServicio;
        this.idCategoria = idCategoria;
    }
    
    

    public int getIdCostosServicio() {
        return idCostosServicio;
    }

    public void setIdCostosServicio(int idCostosServicio) {
        this.idCostosServicio = idCostosServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCostoServicio_precio() {
        return costoServicio_precio;
    }

    public void setCostoServicio_precio(int costoServicio_precio) {
        this.costoServicio_precio = costoServicio_precio;
    }

    public int getIdLugar_inicio() {
        return idLugar_inicio;
    }

    public void setIdLugar_inicio(int idLugar_inicio) {
        this.idLugar_inicio = idLugar_inicio;
    }

    public int getIdLugar_destino() {
        return idLugar_destino;
    }

    public void setIdLugar_destino(int idLugar_destino) {
        this.idLugar_destino = idLugar_destino;
    }

    @Override
    public String toString() {
        return "Costos_Servicios_TO{" + "idCostosServicio=" + idCostosServicio + ", idServicio=" + idServicio + ", idCategoria=" + idCategoria + ", costoServicio_precio=" + costoServicio_precio + ", idLugar_inicio=" + idLugar_inicio + ", idLugar_destino=" + idLugar_destino + '}';
    }

}
