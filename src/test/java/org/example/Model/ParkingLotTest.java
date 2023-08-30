package org.example.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    private ParkingLot testObject;


    @BeforeEach
    public void setUp() {
        Map<Integer, ParkingSpot> parkingSpotMap = new HashMap<>();
        parkingSpotMap.put(1, new ParkingSpot(1, true));
        parkingSpotMap.put(2, new ParkingSpot(2, true));
        parkingSpotMap.put(3, new ParkingSpot(3, false));
        parkingSpotMap.put(4, new ParkingSpot(4, true));

        testObject = new ParkingLot(123, parkingSpotMap);
        testObject.displayParkingSpot();

    }

    @Test
    public void testGetAreaCode() {
        int expectedAreaCode = 123;
        assertEquals(expectedAreaCode, testObject.getAreaCode());
    }

    @Test
    public void testGetParkingSpotSize4() {
        int expectedSize = 4;
        int actual = testObject.getNewList().size();
        assertEquals(expectedSize, actual);
    }

    @Test
    public void testGetAvailableParkingSpot() {
        int exp = 1;
        int act = testObject.getAvailableParkingSpot().size();
        assertEquals(exp, act);
    }

    @Test
    public void testGetParkingSpotBySpotId() {
        ParkingSpot parkingSpot = testObject.getParkingSpotBySpotNumber(2);
        assertNotNull(parkingSpot);
    }

    @Test
    public void testGetParkingSpotBySpotIdFive() {
        ParkingSpot parkingSpot = testObject.getParkingSpotBySpotNumber(5);
        assertNull(parkingSpot);
    }
}