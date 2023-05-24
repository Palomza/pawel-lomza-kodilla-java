package com.kodilla.good.patterns.challenges.orderservice;

public class HouseholdRepository implements OrderRepository {

    public HouseholdRepository() {
    }

    @Override
    public boolean createOrder(User user, String product, int quantity) {
        return false;
    }
}
