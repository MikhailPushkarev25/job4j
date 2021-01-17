package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to09Then9() {
        int expected = 9;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to09Then4() {
        int expected = 4;
        int x1 = 0;
        int y1 = 5;
        int x2 = 0;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to49Then16() {
        int expected = 16;
        int x1 = 0;
        int y1 = 5;
        int x2 = 4;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}