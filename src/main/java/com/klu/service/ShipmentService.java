package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.Shipmententity;
import com.klu.repository.ShipmentRepository;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository repo;

    public Shipmententity addShipment(Shipmententity s) {
        if (s.getShipmentId() == null) {
            throw new RuntimeException("Shipment ID must not be null");
        }
        return repo.save(s);
    }

    public Shipmententity updateShipment(Long id, Shipmententity s) {

        Shipmententity existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        existing.setName(s.getName());
        existing.setShipmentDate(s.getShipmentDate());
        existing.setStatus(s.getStatus());
        existing.setOrigin(s.getOrigin());
        existing.setDestination(s.getDestination());

        return repo.save(existing);
    }
}