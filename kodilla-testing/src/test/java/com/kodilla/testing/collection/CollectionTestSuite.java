package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When created OddNumbersExterminator and used method exterminate " +
            "on an empty ArrayList, then it should return an empty ArrayList"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();
        //When
        List<Integer> result = emptyList.exterminate(list);
        System.out.println("Testing" + result);
        //Then
        Assertions.assertEquals(list, result);
    }

    @DisplayName(
            "When created OddNumbersExterminator and used method exterminate " +
            "on an filled ArrayList with odds and evens, " +
            "then it should return an ArrayList filled with evens"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator normalList = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>(List.of(14, 2, 41, 8));
        List<Integer> expectedList = new ArrayList<>(List.of(14, 2, 8));
        //When
        List<Integer> result = normalList.exterminate(list);
        System.out.println("Testing "+ result);
        //Then
        Assertions.assertEquals(expectedList, result);
    }
}
