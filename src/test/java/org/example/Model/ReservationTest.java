package org.example.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    private Reservation testObject;

   @Test
    public void testConstructorWithoutId() {
       Customer customer=new Customer("test","123456778");
       Vehicle vehicle=new Vehicle("Test001",VehicleType.CAR);
       ParkingSpot parkingSpot=new ParkingSpot(2,true);
       testObject=new Reservation(LocalTime.parse("10:00"),LocalTime.parse("12:00"),customer,vehicle,parkingSpot);
       //assertNull(testObject.getId());
       assertEquals("test",customer.getName());
       assertEquals("Test001",vehicle.getLicencePlate());
   }

}