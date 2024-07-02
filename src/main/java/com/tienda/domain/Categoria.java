package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Especificar que es una capa de datos
@Entity //Esta clase esta enlazada a una tabla en la BD
@Table(name = "categoria") //Especificar cual entidad (tabla)

public class Categoria implements Serializable {

//    autoincremento en java / MYSQL(AUTO_INCREMENT)
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
