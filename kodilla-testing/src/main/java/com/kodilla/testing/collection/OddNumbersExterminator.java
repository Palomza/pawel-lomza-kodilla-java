package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evens = new ArrayList<>();
        for(Integer x : numbers){
            if(x % 2 == 0){
                evens.add(x);
            }
        }
        return evens;
    }
}
