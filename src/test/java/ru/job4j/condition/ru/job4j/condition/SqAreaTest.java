package ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquare() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquare2() {
        int expected = 3;
        int p = 9;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquare3() {
        int expected = 7;
        int p = 21;
        int k = 7;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquare4() {
        int expected = 9;
        int p = 27;
        int k = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}