package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MortgageTest {

    @Test
    public void when1Year() {
        int res = Mortgage.year(1000, 1200, 1);
        int expected = 1;
        assertThat(res, is(expected));
    }

    @Test
    public void when2Year() {
        int res = Mortgage.year(100, 120, 50);
        int expected = 2;
        assertThat(res, is(expected));
    }

    @Test
    public void when() {
        int res = Mortgage.year(250, 340, 40);
        int expected = 2;
        assertThat(res, is(expected));
    }
}