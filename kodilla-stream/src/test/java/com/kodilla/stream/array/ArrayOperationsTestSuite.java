package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] testNumbers = {1, 3, 5, 7, 9, 11, 13, 15};

        //When
        double averageOfTestNumbers = ArrayOperations.getAverage(testNumbers);
        double expectedAverageOfTestNumbers = 8.0;

        //Then
        Assertions.assertEquals(expectedAverageOfTestNumbers, averageOfTestNumbers);

    }
}
