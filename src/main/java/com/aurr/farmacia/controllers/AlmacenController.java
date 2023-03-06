package com.aurr.farmacia.controllers;

import com.aurr.farmacia.entities.Almacen;
import com.aurr.farmacia.services.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("almacen")
public class AlmacenController {
    @Autowired
    private AlmacenService almacenService;

    @GetMapping
    public ResponseEntity<List<Almacen>> getAlmacen() {
        return new ResponseEntity<>(almacenService.getAlmacen(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Almacen> postAlmacen(@RequestBody Almacen almacen) {
        return new ResponseEntity<>(almacenService.postAlmacen(almacen), HttpStatus.OK);
    }
}
