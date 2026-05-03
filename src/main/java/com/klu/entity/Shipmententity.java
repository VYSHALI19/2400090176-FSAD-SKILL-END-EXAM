package com.klu.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Shipmententity{

    @Id
    private Long shipmentId;   // manual ID

    @Column(nullable = false)
    private String name;

    private LocalDate shipmentDate;
    private String status;
    private String origin;
    private String destination;

    // Getters & Setters
    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getShipmentDate() { return shipmentDate; }
    public void setShipmentDate(LocalDate shipmentDate) { this.shipmentDate = shipmentDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}