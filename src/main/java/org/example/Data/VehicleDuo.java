package org.example.Data;

import org.example.Model.Vehicle;

import java.util.Collection;
import java.util.Optional;

public interface VehicleDuo {
    Vehicle create(Vehicle data);
    Optional<Vehicle> find(String licensePlate);
    boolean remove(String licensePlate);
    Collection<Vehicle> findAll();
    void update(Vehicle vehicle);

}
