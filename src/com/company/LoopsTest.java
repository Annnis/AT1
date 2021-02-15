package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoopsTest {
//1
    @Test
    public void testMethod_1() {
        String actual = Loops.SumOfEven();
        String expected = "2450 50";
        Assert.assertEquals(actual, expected);
    }
//2
    @Test
    public void testMethod_2odd() {
        String actual = Loops.isPrime(5);
        String expected = "5 простое число";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMethod_2even() {
        String actual = Loops.isPrime(6);
        String expected = "6 составное число";
        Assert.assertEquals(actual, expected);
    }
//3
    @Test
    public void testMethod_3sqt() {
        int actual = Loops.sqrtBinary(80);
        int expected = 8;
        Assert.assertEquals(actual, expected);
    }
// 4
    @Test
    public void testMethod_4Factorial() {
        int actual = Loops.factorial(8);
        int expected = 40320;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMethod_4FactorialMore20() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                        Loops.factorial(101),
                "Your mark should be more than 0 and less than 100");
    }

    @Test
    public void testMethod_4FactorialLess0() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                        Loops.factorial(-3),
                "Your mark should be more than 0 and less than 100");
    }
//5
    @Test
    public void testMethod_5SumOfNum() {
        int actual = Loops.sumOfnum(18);
        int expected = 9;
        Assert.assertEquals(actual, expected);
    }
// 6
    @Test
    public void testMethod_6Mirrored() {
        String actual = Loops.mirrored(18);
        String expected = "81";
        Assert.assertEquals(actual, expected);

    }
}
