package com.kodilla.good.patterns.challenges.foodtodoor;

public interface Supplier {
    String getSupplierInfo();
    boolean processOrder(Order order);
}
