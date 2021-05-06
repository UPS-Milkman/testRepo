package com.hsbc.interview;

import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz()
    {
        for (int i = 0; i <= 100; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                Assert.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(i));
            }
            else if(i%3 == 0){
                Assert.assertEquals("Fizz",FizzBuzz.fizzBuzz(i));
            }
            else if(i%5 == 0) {
                Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(i));
            }
            else {
                Assert.assertEquals(Integer.toString(i),FizzBuzz.fizzBuzz(i));
            }
    }
}

