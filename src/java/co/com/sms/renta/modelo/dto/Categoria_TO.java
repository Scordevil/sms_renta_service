/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sms.renta.modelo.dto;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo una Categoria
 *
 * Tabla Relacionada sms_categoria
 *
 * @author sms
 */
@XmlRootElement
public class Categoria_TO {

    /**
     *
     * Columna idCategoria
     */
    private int idCategoria;

    /**
     *
     * Columna Categoria_nombre
     */
    private String categoriaNombre;

    /**
     *
     * Columna Categoria_descripcion
     */
    private String categoriaDescripcion;

    public Categoria_TO() {
    }

    public Categoria_TO(int idCategoria, String categoriaNombre, String categoriaDescripcion) {
        this.idCategoria = idCategoria;
        this.categoriaNombre = categoriaNombre;
        this.categoriaDescripcion = categoriaDescripcion;
    }

    public Categoria_TO(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public String getCategoriaDescripcion() {
        return categoriaDescripcion;
    }

    public void setCategoriaDescripcion(String categoriaDescripcion) {
        this.categoriaDescripcion = categoriaDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idCategoria;
        hash = 97 * hash + Objects.hashCode(this.categoriaNombre);
        hash = 97 * hash + Objects.hashCode(this.categoriaDescripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria_TO other = (Categoria_TO) obj;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        if (!Objects.equals(this.categoriaNombre, other.categoriaNombre)) {
            return false;
        }
        if (!Objects.equals(this.categoriaDescripcion, other.categoriaDescripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria_TO{" + "idCategoria=" + idCategoria + ", categoriaNombre=" + categoriaNombre + ", categoriaDescripcion=" + categoriaDescripcion + '}';
    }

}
