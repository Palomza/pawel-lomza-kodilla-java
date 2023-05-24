package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class Food2Door {

    private static Map<String, Supplier> suppliers;

    public Food2Door() {
        suppliers = new HashMap<>();
        suppliers.put("ExtraFoodShop", new ExtraFoodShop());
        suppliers.put("HealthyShop", new HealthyShop());
        suppliers.put("GlutenFreeShop", new GlutenFreeShop());
    }

    public void SupplierProductsList() {
        System.out.println("Displaying list of all suppliers:");
        for(Supplier supplier : suppliers.values()){
            System.out.println(supplier.getSupplierInfo());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Food2Door food2Door = new Food2Door();
        food2Door.SupplierProductsList();

        Order order1 = new Order("Green healthy kale", 5);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(suppliers, order1);


    }
}
