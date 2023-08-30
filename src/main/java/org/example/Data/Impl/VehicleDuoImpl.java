package org.example.Data.Impl;

import org.example.Data.VehicleDuo;
import org.example.Model.Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class VehicleDuoImpl implements VehicleDuo {

    private List<Vehicle>storage=new ArrayList<>();

    @Override
    public Vehicle create(Vehicle data) {
        if(data== null) throw new RuntimeException("Data is null");
        //Optional<Vehicle> checklicensePlateResult=find(data.getLicencePlate());
        //if(checklicensePlateResult.isPresent())throw new RuntimeException("IS ALREADY PRESENT");
        if(find(data.getLicencePlate()).isPresent())throw new RuntimeException("Already pressent");
        storage.add(data);
        return data;}

    @Override
    public Optional<Vehicle> find(String licensePlate) {
        for (Vehicle element:storage) {
            if(element.getLicencePlate().equals(licensePlate)){
                return Optional.of(element);}
        }
        return Optional.empty();
    }


    @Override
    public boolean remove(String licensePlate) {
        Optional<Vehicle> vehicleOptional=find(licensePlate);
        if(vehicleOptional.isEmpty())
        return false;
        else {
            storage.remove(vehicleOptional.get());
            return true;
        }
    }

    @Override
    public Collection<Vehicle> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public void update(Vehicle vehicle) {

    }
}
