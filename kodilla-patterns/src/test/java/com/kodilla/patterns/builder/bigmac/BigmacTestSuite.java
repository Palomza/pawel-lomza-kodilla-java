package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigmacTestSuite {

    private Class<? extends Throwable> IllegalArgumentException;

    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .ingredients("BACON")
                .ingredients("CHEESE")
                .sauce("standard")
                .ingredients("SALAD")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }

    @Test
    void testBigmacNeWithIllegalIngredient(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .ingredients("BACON")
                .ingredients("CHEESE")
                .sauce("standard")
                .ingredients("SALAD")
                .ingredients("BICYCLE")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }

}
