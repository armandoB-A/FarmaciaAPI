package com.aurr.farmacia.repositories;

import com.aurr.farmacia.entities.Presentacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentacionRepository extends JpaRepository<Presentacion, Integer> {
}