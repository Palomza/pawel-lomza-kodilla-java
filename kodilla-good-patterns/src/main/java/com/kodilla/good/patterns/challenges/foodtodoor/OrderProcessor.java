package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.Map;

public class OrderProcessor {

    public OrderProcessor() {
    }

    public boolean process(Map<String, Supplier> suppliers, Order order){
        boolean orderProcessed = false;

        System.out.println("Starting process of order: " + order.toString());

        for(Supplier supplier : suppliers.values()) {
            if(supplier.processOrder(order)) {
                orderProcessed = true;
                break;
            }
        }

        if(!orderProcessed) {
            System.out.println("Can't complete order process!");
        }

        return orderProcessed;
    }
}
