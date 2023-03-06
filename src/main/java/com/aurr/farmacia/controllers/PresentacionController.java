package com.aurr.farmacia.controllers;

import com.aurr.farmacia.entities.Presentacion;
import com.aurr.farmacia.services.PresentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("presentacion")
public class PresentacionController {
    @Autowired
    private PresentacionService presentacionService;

    @GetMapping
    public ResponseEntity<List<Presentacion>> getPresentacion() {
        return new ResponseEntity<>(presentacionService.getPresentacion(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Presentacion> postPresentacion(@RequestBody Presentacion Presentacion) {
        return new ResponseEntity<>(presentacionService.postPresentacion(Presentacion), HttpStatus.OK);
    }
}
