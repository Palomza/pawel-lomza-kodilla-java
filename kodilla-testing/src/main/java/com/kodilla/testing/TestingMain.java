package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        if(5 == calculator.add(2, 3)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if(3 == calculator.subtract(5, 2)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
