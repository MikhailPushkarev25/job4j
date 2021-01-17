package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeightThen80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWomanWeightThen51() {
        short in = 150;
        double expected = 46.0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}