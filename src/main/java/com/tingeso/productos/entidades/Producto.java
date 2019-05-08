package com.tingeso.productos.entidades;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer codigoProducto;
    private String nombreProducto;
    private String categoria;
    private Integer precio;
}