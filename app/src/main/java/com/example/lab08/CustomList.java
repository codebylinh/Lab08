package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private final List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        // The simplest implementation is to use the list's remove method.
        // We must check if the city exists first to avoid errors, though remove() handles this.
        if (cities.contains(city)) {
            cities.remove(city);
        }
    }

}
