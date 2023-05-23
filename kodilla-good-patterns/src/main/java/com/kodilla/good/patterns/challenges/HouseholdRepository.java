package com.kodilla.good.patterns.challenges;

public class HouseholdRepository implements OrderRepository {

    public HouseholdRepository() {
    }

    @Override
    public boolean createOrder(User user, String product, int quantity) {
        return false;
    }
}
