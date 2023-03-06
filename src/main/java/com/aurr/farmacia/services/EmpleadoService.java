package com.aurr.farmacia.services;

import com.aurr.farmacia.entities.Empleado;
import com.aurr.farmacia.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;
    public List<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado postEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
