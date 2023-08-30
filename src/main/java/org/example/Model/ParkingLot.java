package org.example.Model;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private int areaCode;
    private Map<Integer, ParkingSpot> parkingSpotMap;


    public ParkingLot(int areaCode, Map<Integer, ParkingSpot> parkingSpotMap) {
        this.areaCode = areaCode;
        this.parkingSpotMap = parkingSpotMap;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public List<ParkingSpot> getNewList() {
        List<ParkingSpot> spotList = new ArrayList<>(parkingSpotMap.values());
        return spotList;
    }

    public List<ParkingSpot> getAvailableParkingSpot() {
        List<ParkingSpot> availableSpot = new ArrayList<>();
        {
            for (ParkingSpot parkingspot : parkingSpotMap.values())
                if (!parkingspot.isOccupied())
                    availableSpot.add(parkingspot);
        }
        return availableSpot;
    }
    public ParkingSpot getParkingSpotBySpotNumber(int spotNumber)
    {
        return  parkingSpotMap.get(spotNumber);
    }

    public void displayParkingSpot()
    {
        System.out.println("-----------------------");
        int count=0;
        for (ParkingSpot spot:parkingSpotMap.values()) {
            count++;
            System.out.println("| " + spot.getSpotNumber() + " " + (spot.isOccupied() ? " X " : " \u2713"));
            System.out.print(" | ");
            if (count % 3 == 0) {
                System.out.println();
                System.out.println("-------------------");
            }
        }
        System.out.println("------------------------");
    }
    @Override
    public String toString() {
        return "ParkingLot{" +
                "areaCode=" + areaCode +
                ", parkingSpotMap=" + parkingSpotMap +
                '}';
    }
}


