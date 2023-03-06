package com.aurr.farmacia.services;

import com.aurr.farmacia.entities.Presentacion;
import com.aurr.farmacia.repositories.PresentacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresentacionService {
    @Autowired
    private PresentacionRepository presentacionRepository;

    public List<Presentacion> getPresentacion() {
        return presentacionRepository.findAll();
    }

    public Presentacion postPresentacion(Presentacion presentacion) {
        return presentacionRepository.save(presentacion);
    }
}
