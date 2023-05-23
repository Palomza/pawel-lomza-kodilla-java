package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private String product;
    private int quantity;

    public OrderRequest(final User user, final String product, final int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
