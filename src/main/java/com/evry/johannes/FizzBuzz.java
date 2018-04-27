package com.evry.johannes;

public class FizzBuzz {

    public String convertFizzBuzz(int i) {
        if(i % 15 == 0) {
            return "fizzbuzz";
        } else if(i % 5 == 0) {
            return "buzz";
        } else if(i % 3 == 0) {
            return "fizz";
        } else {
            return Integer.toString(i);
        }
    }
}
