package org.example.Model;
import org.example.Model.ParkingSpot;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestParkingSpot {
    private  ParkingSpot parkingSpot;

    @BeforeEach
    public void setUp()
    {
        parkingSpot=new ParkingSpot(11,false);
    }
    @Test
    public void testSpotNumber()
    {
        int expected=11;
        int actual= parkingSpot.getSpotNumber();
        assertEquals(expected,actual);
    }
    @Test
    public void testIsSpotOccupied()
    {
        boolean expected=false;
        boolean actual=parkingSpot.isOccupied();
        assertEquals(expected,actual);

    }
    @Test
    public void testIsOccupyInitiallyFalse()
    {
         assertFalse(parkingSpot.isOccupied());
    }
    @Test
    public void testIsOccupy()
    {
        parkingSpot.Occupy();
        assertTrue(parkingSpot.isOccupied());
    }
    @Test
    public void testIsVacate()
    {
        parkingSpot.Occupy();
        parkingSpot.Vacate();
        assertFalse(parkingSpot.isOccupied());
    }
}

