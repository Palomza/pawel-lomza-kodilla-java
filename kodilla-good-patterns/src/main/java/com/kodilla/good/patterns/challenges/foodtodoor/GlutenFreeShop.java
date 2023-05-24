package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private final Map<String, Integer> supply;
    private final String name = "GlutenFreeShop";

    public GlutenFreeShop() {
        this.supply = new HashMap<>();
        supply.put("Bikes", 7);
        supply.put("Pool table", 3);
        supply.put("Horse saddle", 9);
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
