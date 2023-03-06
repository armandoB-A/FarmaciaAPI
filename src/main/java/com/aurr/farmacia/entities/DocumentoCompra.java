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
@Table(name = "DOCUMENTO_COMPRA")
public class DocumentoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDOCUMENTO_COMPRA", nullable = false)
    private Integer id;

    @Column(name = "FECHA_COMPRA", nullable = false)
    private LocalDate fechaCompra;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idPROVEDOR", nullable = false)
    private Provedor idPROVEDOR;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idEMPLEADO", nullable = false)
    private Empleado idEMPLEADO;

}