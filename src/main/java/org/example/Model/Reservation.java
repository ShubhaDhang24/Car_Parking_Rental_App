package org.example.Model;

import java.time.LocalTime;

public class Reservation {
    private int id;
    private LocalTime startTime,endTime;
    private Customer customer;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    //CONSTRUCTOR


    public Reservation(int id, LocalTime startTime, LocalTime endTime, Customer customer, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.customer = customer;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public Reservation(LocalTime startTime, LocalTime endTime, ParkingSpot parkingSpot) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.parkingSpot = parkingSpot;
    }

    public Reservation(LocalTime startTime, LocalTime endTime, Customer customer, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.customer = customer;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public int getId() {
        return id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}

