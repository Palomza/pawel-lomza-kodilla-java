package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    void BasicPizzaOrderCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    void basicPizzaDescriptionTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        String description = order.getIngredients();
        //Then
        Assertions.assertEquals("Tomato sauce + cheese", description);
    }

    @Test
    void extraCheesePizzaOrderCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(19), calculatedCost);
    }

    @Test
    void extraCheesePizzaDescriptionTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        String description = order.getIngredients();
        //Then
        Assertions.assertEquals("Tomato sauce + cheese + extra cheese", description);
    }

    @Test
    void hamPizzaOrderCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(21), calculatedCost);
    }

    @Test
    void hamPizzaDescriptionTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);
        //When
        String description = order.getIngredients();
        //Then
        Assertions.assertEquals("Tomato sauce + cheese + ham", description);
    }

    @Test
    void fullPizzaOrderCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new HamDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    void fullPizzaPizzaDescriptionTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);
        order = new ExtraCheeseDecorator(order);
        //When
        String description = order.getIngredients();
        //Then
        Assertions.assertEquals("Tomato sauce + cheese + ham + extra cheese", description);
    }
}