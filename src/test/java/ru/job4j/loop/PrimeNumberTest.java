package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int res = PrimeNumber.calc(5);
        int expected = 3;
        assertThat(res, is(expected));
    }

    @Test
    public void when11() {
        int result = PrimeNumber.calc(11);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void when2() {
        int result = PrimeNumber.calc(2);
        int expected = 1;
        assertThat(result, is(expected));
    }
}