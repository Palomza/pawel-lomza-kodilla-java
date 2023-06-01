package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculatorAdd() {
        //Given
        //When
        double addResult = calculator.add(2.0, 4.0);
        //Then
        Assertions.assertEquals(6.0, addResult);
    }

    @Test
    void testCalculatorSub() {
        //Given
        //When
        double subResult = calculator.sub(2.0, 4.0);
        //Then
    }

    @Test
    void testCalculatorMul() {
        //Given
        //When
        double mulResult = calculator.mul(2.0, 4.0);
        //Then
        Assertions.assertEquals(8.0, mulResult);
    }

    @Test
    void testCalculatorDiv() {
        //Given
        //When
        double divResult = calculator.div(2.0, 4.0);
        //Then
        Assertions.assertEquals(0.5, divResult);
    }
}
