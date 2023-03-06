package com.aurr.farmacia.controllers;

import com.aurr.farmacia.entities.Empleado;
import com.aurr.farmacia.entities.Provedor;
import com.aurr.farmacia.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<Empleado>> getEmpleados() {
        return new ResponseEntity<>(empleadoService.getEmpleados(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Empleado> postProveedor(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(empleadoService.postEmpleado(empleado), HttpStatus.OK);
    }
}
