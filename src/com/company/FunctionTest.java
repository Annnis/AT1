package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    public void findDate(){
        String actual = Function.dateByNum(5);
        String expected = "Friday";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void distance(){
        int actual = (int) Function.distance(5,6,8,9);
        int expected = 4;
        Assert.assertEquals(actual,expected);
    }
}
