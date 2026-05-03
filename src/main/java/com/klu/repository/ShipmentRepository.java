package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.entity.Shipmententity;

public interface ShipmentRepository extends JpaRepository<Shipmententity, Long> {
}