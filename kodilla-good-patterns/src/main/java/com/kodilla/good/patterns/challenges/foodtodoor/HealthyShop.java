package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private final Map<String, Integer> supply;
    private final String name = "HealthyShop";

    public HealthyShop() {
        this.supply = new HashMap<>();
        supply.put("Green healthy kale", 16);
        supply.put("Very healthy socks", 33);
        supply.put("Ultra healthy blankets", 4);
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
