package org.example.Model;

import org.example.Model.Customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCustomer {
    Customer customer;

    @BeforeEach
    public void setUp() {

        customer = new Customer(1, "Test", "123456789");
    }

    @Test
    public void getPhoneNumber() {
        String expectedRes = "123456789";
        String actualRes;
        assertEquals(expectedRes, customer.getPhoneNumber());
    }
    @Test
    public void testGetName() {
        String expectedRes = "Test";
        String actualRes = customer.getName();
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void getNameByAssertEquals() {
        String expectedRes = "Test";
        String actualRes;
        assertEquals(expectedRes, customer.getName());
    }

    @Test
    public void getId() {
        int expectedRes = 1;
        assertEquals(expectedRes, customer.getId());
    }
   @Test
    public void testToString()
    {
        assertTrue(customer.toString().contains("1"));
        assertTrue(customer.toString().contains("Test"));
        assertTrue(customer.toString().contains("123456789"));
    }

}
