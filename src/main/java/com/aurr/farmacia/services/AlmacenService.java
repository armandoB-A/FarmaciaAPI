package com.aurr.farmacia.services;

import com.aurr.farmacia.entities.Almacen;
import com.aurr.farmacia.repositories.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService {
    @Autowired
    private AlmacenRepository almacenRepository;
    public List<Almacen> getAlmacen() {
        return almacenRepository.findAll();
    }

    public Almacen postAlmacen(Almacen almacen) {
        return almacenRepository.save(almacen);
    }
}
