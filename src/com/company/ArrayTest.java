package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

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
    public void Method_6Reverse() {
        int[] array = new int[]{7, 2, 9, 5};
        int[] actual = Array.reverse(array);
        int[] expected = {5, 9, 2, 7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Method_7SumOfEven() {
        int[] array = new int[]{7, 2, 9, 6};
        int actual = Array.sumOfEven(array);
        int expected = 8;
        Arrays.toString(new int[]{actual});
        Arrays.toString(new int[]{expected});
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void Method_8HalfRevers () {
            int[] array = new int[]{6, 2, 3, 1};
            int[] actual = Array.halfReverse(array);
            int[] expected = {3, 1, 6, 2};
            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void Method_9Bubble () {
            int[] array = new int[]{6, 2, 3, 1};
            int[] actual = Array.sortByBubble(array);
            int[] expected = {1, 2, 3, 6};
            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void Method_9Insert () {
            int[] array = new int[]{6, 2, 3, 1};
            int[] actual = Array.sortByInsert(array);
            int[] expected = {1, 2, 3, 6};
            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void Method_9Select () {
            int[] array = new int[]{6, 2, 3, 1};
            int[] actual = Array.sortBySelect(array);
            int[] expected = {1, 2, 3, 6};
            Assertions.assertArrayEquals(expected, actual);
        }
    }






