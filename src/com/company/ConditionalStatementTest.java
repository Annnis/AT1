package com.company;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalStatementTest {
//1
    @Test
    public void testMethod_1even_2() {
        int actual = ConditionalStatement.sumOrMultyply(2, 3);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_1odd_3() {
        int actual = ConditionalStatement.sumOrMultyply(3, 3);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }
//2
    @Test
    public void testMethod_2first() {
        String actual = ConditionalStatement.findDot(1, -1);
        String expected = "IV";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2second() {
        String actual = ConditionalStatement.findDot(1, 1);
        String expected = "I";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2third() {
        String actual = ConditionalStatement.findDot(-1, -1);
        String expected = "III";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2forth() {
        String actual = ConditionalStatement.findDot(-1, 1);
        String expected = "II";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2fifth() {
        String actual = ConditionalStatement.findDot(1, 0);
        String expected = "between I & IV";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2sixth() {
        String actual = ConditionalStatement.findDot(-1, 0);
        String expected = "between II & III";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2seventh() {
        String actual = ConditionalStatement.findDot(0, 1);
        String expected = "between I & II";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2eighth() {
        String actual = ConditionalStatement.findDot(0, -1);
        String expected = "between III && IV";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_2ninth() {
        String actual = ConditionalStatement.findDot(0, 0);
        String expected = "START";
        Assert.assertEquals(expected, actual);
    }
//3

    @Test
    public void testMethod_3positiveAll() {
        int actual = ConditionalStatement.sumOfPositive(1, 2, 3);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMethod_3negative3() {
        int actual = ConditionalStatement.sumOfPositive(1, 2, -3);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMethod_3negative2() {
        int actual = ConditionalStatement.sumOfPositive(1, -2, 3);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMethod_3negative1() {
        int actual = ConditionalStatement.sumOfPositive(-1, 2, 3);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
//4
    @Test
    public void testMethod_4Sum() {
        int actual = ConditionalStatement.countSumOrMultypyly(1, 2, 3);
        int expected = 9;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMethod_4multiply() {
        int actual = ConditionalStatement.countSumOrMultypyly(8, 2, 20);
        int expected = 323;
        Assert.assertEquals(expected, actual);
    }
//5
    @Test
    public void testMethod_5Less_than0() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                        ConditionalStatement.markByRate(101),
                "Your mark should be more than 0 and less than 100");
    }
    @Test
    public void testMethod_5F() {
        String actual = ConditionalStatement.markByRate(18);
        String expected = "Your mark is F";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMethod_5E() {
        String actual = ConditionalStatement.markByRate(25);
        String expected = "Your mark is E";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_5D() {
        String actual = ConditionalStatement.markByRate(45);
        String expected = "Your mark is D";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_5C() {
        String actual = ConditionalStatement.markByRate(65);
        String expected = "Your mark is C";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMethod_5B() {
        String actual = ConditionalStatement.markByRate(78);
        String expected = "Your mark is B";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMethod_5A() {
        String actual = ConditionalStatement.markByRate(95);
        String expected = "Your mark is A";
        Assert.assertEquals(expected, actual);
    }
}
























