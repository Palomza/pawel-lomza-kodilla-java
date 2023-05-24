package com.kodilla.good.patterns.challenges.orderservice;

public interface OrderRepository {

    boolean createOrder (User user, String product, int quantity);
}
