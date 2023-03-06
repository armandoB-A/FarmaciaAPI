package com.aurr.farmacia.repositories;

import com.aurr.farmacia.entities.Provedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvedorRepository extends JpaRepository<Provedor, Integer> {
}