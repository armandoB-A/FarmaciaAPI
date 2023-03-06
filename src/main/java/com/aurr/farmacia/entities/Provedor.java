package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PROVEDOR")
public class Provedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPROVEDOR", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 15)
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DENOMINACION_SOCIAL")
    private String denominacionSocial;

    @Column(name = "NOMBRE_EMPRESA")
    private String nombreEmpresa;

    @Column(name = "TELEFONO")
    private Long telefono;

    @Column(name = "CORREO")
    private String correo;

}