package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "DETALLE_COMPRA")
public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDETALLE_COMPRA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "IDDOC_COMPRA", nullable = false)
    private DocumentoCompra iddocCompra;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "IDMEDICAMENTO", nullable = false)
    private Producto idmedicamento;

    @Column(name = "PRECIO", nullable = false)
    private Float precio;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

}