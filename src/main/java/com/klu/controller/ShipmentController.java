package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.entity.Shipmententity;
import com.klu.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService service;

    // POST API - Create Shipment
    @PostMapping
    public Shipmententity create(@RequestBody Shipmententity s) {
        return service.addShipment(s);
    }

    // PUT API - Update Shipment
    @PutMapping("/{id}")
    public Shipmententity update(@PathVariable Long id, @RequestBody Shipmententity s) {
        return service.updateShipment(id, s);
    }
}