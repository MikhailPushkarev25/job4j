package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TrgAreaTest {
    @Test
    public void whenArea() {
        double expected = 1.7320508075688772;
        int a = 2;
        int b = 2;
        int c = 2;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);

    }
}