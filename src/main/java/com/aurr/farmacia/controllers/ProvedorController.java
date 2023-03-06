package com.aurr.farmacia.controllers;

import com.aurr.farmacia.entities.Provedor;
import com.aurr.farmacia.services.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("provedor")
public class ProvedorController {
    @Autowired
    private ProvedorService provedorService;

    @GetMapping
    public ResponseEntity<List<Provedor>> getProveedor() {
        return new ResponseEntity<>(provedorService.getProvedorRepository(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Provedor> postProveedor(@RequestBody Provedor provedor) {
        return new ResponseEntity<>(provedorService.postProvedor(provedor), HttpStatus.OK);
    }
}
