package com.example.lab08;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        // Setup
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Action
        list.deleteCity(calgary);

        // Assertion
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        // Setup
        CustomList list = new CustomList();
        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Edmonton", "AB"));

        // Action & Assertion
        // We expect the count to be 2.
        Assert.assertEquals(2, list.countCities()); // This method doesn't exist yet!
    }

}