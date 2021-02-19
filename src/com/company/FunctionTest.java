package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    public void findDate() {
        String actual = Function.dateByNum(5);
        String expected = "Friday";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void distance() {
        int actual = (int) Function.distance(5, 6, 8, 9);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getString5() {
        String actual = Function.getStringByNumber(8);
        String expected = "восемь  ";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void getString58() {
        String actual = Function.getStringByNumber(58);
        String expected = "пятьдесят восемь  ";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void getString581() {
        String actual = Function.getStringByNumber(581);
        String expected = "пятьсот восемьдесят один  ";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getNum5() {
        int actual = Function.getNumberByString("пять");
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getNum15() {
        int actual = Function.getNumberByString("пятнадцать");
        int expected = 15;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getNum151() {
        int actual = Function.getNumberByString("сто пятьдесят один");
        int expected = 151;
        Assert.assertEquals(actual, expected);
    }
}
