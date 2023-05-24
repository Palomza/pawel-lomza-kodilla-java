package com.kodilla.good.patterns.challenges.orderservice;

public interface OrderService {

    boolean order(User user, String product, int quantity);
}
