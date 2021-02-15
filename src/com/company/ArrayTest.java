package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void Method_1MinOfArr() {
        int[] array = new int[]{7, 2, 9, 5};
        String actual = Array.minOfArr(array);
        String expected = "Min value 2";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Method_2MaxOfArr() {
        int[] array = new int[]{7, 2, 9, 5};
        String actual = Array.maxOfArr(array);
        String expected = "Max value 9";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Method_3MaxOfInd() {
        int[] array = new int[]{7, 2, 9, 5};
        String actual = Array.maxOfIndex(array);
        String expected = "Max index 2";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Method_4MinOfInd() {
        int[] array = new int[]{7, 2, 9, 5};
        String actual = Array.minOfIndex(array);
        String expected = "Min index 1";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Method_5SumOfOdd() {
        int[] array = new int[]{7, 2, 9, 5};
        int actual = Array.sumOfOdd(array);
        int expected = 21;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Method_6SumOfEven() {
        int[] array = new int[]{7, 2, 9, 6};
        int actual = Array.sumOfEven(array);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
