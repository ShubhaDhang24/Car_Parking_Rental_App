

package org.example.Model;

public class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;

    //Constructor
      ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
      }

    public ParkingSpot(int spotNumber, boolean isOccupied) {
        this.spotNumber = spotNumber;
        this.isOccupied = isOccupied;
    }

    //Getters
    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    //Methods
    public void Occupy()
    {
        isOccupied=true;
    }
    public void Vacate()
    {
        isOccupied=false;
    }
}
