package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRESENTACION")
public class Presentacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presentacion", nullable = false)
    private Integer id;

    @Column(name = "presentacion", nullable = false)
    private String presentacion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

}