package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Doe");
        String product = "Cool cooler";
        int quantity = 1;

        return new OrderRequest(user, product, quantity);
    }
}
