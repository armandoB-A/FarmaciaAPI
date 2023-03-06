package com.aurr.farmacia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EMPLEADO")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEMPLEADO", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE_EMPLEADO", nullable = false, length = 100)
    private String nombreEmpleado;

    @Column(name = "APELLIDO_EMPLEADO", nullable = false, length = 150)
    private String apellidoEmpleado;

    @Column(name = "CURP")
    private String curp;

    @Column(name = "TELEFONO")
    private Integer telefono;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TIPO_SANGRE")
    private String tipoSangre;

}