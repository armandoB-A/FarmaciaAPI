package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLASIFICACION")
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clasificaciones", nullable = false)
    private Integer id;

    @Column(name = "nombre_clasif", nullable = false)
    private String nombreClasif;

    @Column(name = "descripcion_clasif", nullable = false)
    private String descripcionClasif;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

}