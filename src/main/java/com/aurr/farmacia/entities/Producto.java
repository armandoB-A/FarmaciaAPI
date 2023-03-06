package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTO")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 45)
    private String nombre;

    @Column(name = "FECHA_REG", nullable = false)
    private Instant fechaReg;

    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_presentacion")
    private Clasificacion idPresentacion;

    @Column(name = "descuento", nullable = false)
    private Float descuento;

    @Column(name = "precio_compra", nullable = false)
    private Float precioCompra;

    @Column(name = "precio_venta", nullable = false)
    private String precioVenta;

    @Column(name = "id_clasifiicacion", nullable = false)
    private Integer idClasifiicacion;

    @Column(name = "receta_status")
    private Boolean recetaStatus;

}