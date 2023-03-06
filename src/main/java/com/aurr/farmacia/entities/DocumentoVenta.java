package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "DOCUMENTO_VENTA")
public class DocumentoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_DOCUMENTO_VENTA", nullable = false)
    private Integer id;

    @Column(name = "FECHA_VENTA", nullable = false)
    private LocalDate fechaVenta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_EMPLEADO", nullable = false)
    private Empleado idEmpleado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "dni_CLIENTE", nullable = false)
    private Cliente dniCliente;

    @Column(name = "receta_status")
    private Boolean recetaStatus;

}