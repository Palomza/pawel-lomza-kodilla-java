package com.kodilla.good.patterns.challenges.foodtodoor;

public class Order {

    private final String product;
    private final int quantity;

    public Order(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return product + " x" + quantity;
    }
}
