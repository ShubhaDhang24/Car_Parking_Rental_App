package org.example.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle vehicle;

    @BeforeEach
    public void setUp()
    {
         vehicle =new Vehicle("SS1001",VehicleType.CAR);
    }
    @Test
    public void testGetLicencePlate()
    {
        String expectedResult="SS1001";
        String actRes= vehicle.getLicencePlate();
        assertEquals(expectedResult,actRes);
    }
    @Test
    public void testGetVehicleType()
    {
        VehicleType expectedRes=VehicleType.CAR;
         VehicleType actualRes=vehicle.getVehicleType();
        assertEquals(expectedRes,actualRes);
    }

    @Test
    public void testToString() {
        assertTrue(vehicle.toString().contains("SS1001"));
        assertTrue(vehicle.toString().contains("CAR"));
    }
}