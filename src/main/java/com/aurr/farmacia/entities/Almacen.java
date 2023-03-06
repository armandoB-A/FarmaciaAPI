package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ALMACEN")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idALMACEN", nullable = false)
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "referencia")
    private String referencia;

}