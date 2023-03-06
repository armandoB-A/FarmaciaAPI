package com.aurr.farmacia.services;

import com.aurr.farmacia.entities.Clasificacion;
import com.aurr.farmacia.entities.Empleado;
import com.aurr.farmacia.repositories.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {
    @Autowired
    private ClasificacionRepository clasificacionRepository;
    public List<Clasificacion> getClasificaciones() {
        return clasificacionRepository.findAll();
    }

    public Clasificacion postClasificacion(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }
}
