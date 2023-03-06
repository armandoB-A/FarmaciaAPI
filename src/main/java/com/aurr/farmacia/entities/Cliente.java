package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDNI", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 15)
    private String nombre;

}