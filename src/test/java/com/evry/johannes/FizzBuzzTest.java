package com.evry.johannes;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void convertFizzBuzz_givenANumberDividableBy3_shouldReturnFizz() {
        String result = fizzBuzz.convertFizzBuzz(6);
        Assert.assertEquals("fizz", result);
    }

    @Test
    public void convertFizzBuzz_givenANumberDividableBy5_shouldReturnBuzz() {
        String result = fizzBuzz.convertFizzBuzz(10);
        Assert.assertEquals("buzz", result);
    }

    @Test
    public void convertFizzBuzz_givenANumberDividableBy15_shouldReturnFizzBuzz() {
        String result = fizzBuzz.convertFizzBuzz(30);
        Assert.assertEquals("fizzbuzz", result);
    }

    @Test
    public void convertFizzBuzz_givenANumberNotDividable_shouldReturnTheNumber() {
        String result = fizzBuzz.convertFizzBuzz(4);
        Assert.assertEquals("4", result);
    }
}

