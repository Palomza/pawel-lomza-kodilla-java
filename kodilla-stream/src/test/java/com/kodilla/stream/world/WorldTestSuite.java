package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europe.addCountry(new Country("Czech", new BigDecimal("10000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000000")));

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("Canada", new BigDecimal("40000000")));
        northAmerica.addCountry(new Country("United States", new BigDecimal("330000000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("130000000")));

        world.addContinent(europe);
        world.addContinent(northAmerica);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldPopulation = new BigDecimal("630000000");
        Assertions.assertEquals(expectedWorldPopulation, worldPopulation);
    }
}
