package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier{

    private final Map<String, Integer> supply;
    private final String name = "ExtraFoodShop";

    public ExtraFoodShop() {
        this.supply = new HashMap<>();
        supply.put("Oat milk", 25);
        supply.put("Goat milk", 12);
        supply.put("King potatoes", 8);
    }

    @Override
    public String getSupplierInfo() {
        return name + " supply is: " + supply.keySet();
    }

    @Override
    public boolean processOrder(Order order) {
        if (supply.containsKey(order.getProduct()) && supply.get(order.getProduct()) >= order.getQuantity()){
            supply.put(order.getProduct(), supply.get(order.getProduct()) - order.getQuantity());
            System.out.println("The order has been completed successfully in: " + name);
            return true;
        } else {
            System.out.println("Fail! Order cannot be completed in: " + name);
            return false;
        }
    }
}
