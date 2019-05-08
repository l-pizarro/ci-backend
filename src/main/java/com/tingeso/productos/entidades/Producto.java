package com.tingeso.productos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoProducto;
    private String nombreProducto;
    private String fechaVencimiento;
    private String categoria;
    private Integer precio;

}
