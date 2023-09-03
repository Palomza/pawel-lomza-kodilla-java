package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaOrderDecorator extends BasicPizzaOrder {
    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }
    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients();
    }
}