package com.aurr.farmacia.controllers;

import com.aurr.farmacia.entities.Clasificacion;
import com.aurr.farmacia.entities.Presentacion;
import com.aurr.farmacia.services.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clasificacion")
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping
    public ResponseEntity<List<Clasificacion>> getClasificacion() {
        return new ResponseEntity<>(clasificacionService.getClasificaciones(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Clasificacion> postClasificacion(@RequestBody Clasificacion clasificacion) {
        return new ResponseEntity<>(clasificacionService.postClasificacion(clasificacion), HttpStatus.OK);
    }
}
