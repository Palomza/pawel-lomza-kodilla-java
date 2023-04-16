package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleItem;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private String name;
    private List<Country> countries;

    public Continent(String name) {
        this.name = name;
        countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
