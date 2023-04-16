package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(i + ": " + numbers[i]));

        double numbersAverage = IntStream.range(0, numbers.length)
                .mapToDouble(i -> numbers[i])
                .average()
                .orElse(Double.NaN); //Nie wiem do końca czy to poprawne, ale bez tego dopisku wyrzucało mi błąd.

        return numbersAverage;
    }
}
