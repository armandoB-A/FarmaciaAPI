package com.aurr.farmacia.services;

import com.aurr.farmacia.entities.Provedor;
import com.aurr.farmacia.repositories.ProvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvedorService {
    @Autowired
    private ProvedorRepository provedorRepository;

    public List<Provedor> getProvedorRepository() {
        return provedorRepository.findAll();
    }

    public Provedor postProvedor(Provedor provedor) {
        return provedorRepository.save(provedor);
    }
}
