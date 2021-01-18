package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class TreeMaxTest {

    @Test
    public void firstMax() {
        int res = TreeMax.max(10, 5, 1);
        assertThat(res, is(10));
    }

    @Test
    public void thirdMax() {
        int res = TreeMax.max(1, 5, 100);
        assertThat(res, is(100));
    }

    @Test
    public void allEq() {
        int res = TreeMax.max(1, 1, 1);
        assertThat(res, is(1));
    }

    @Test
    public void firstEqSecond() {
        int res = TreeMax.max(10, 10, 1);
        assertThat(res, is(10));
    }

    @Test
    public void firstEqThird() {
        int res = TreeMax.max(100, 1, 100);
        assertThat(res, is(100));
    }

    @Test
    public void secondEqThird() {
        int res = TreeMax.max(1, 100, 100);
        assertThat(res, is(100));
    }
}