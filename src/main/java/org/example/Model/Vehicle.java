package org.example.Model;

public class Vehicle {

    private String licencePlate;
    VehicleType vehicleType;

    //Constructor
    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    //getters
    public String getLicencePlate() {
        return licencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licencePlate='" + licencePlate + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
