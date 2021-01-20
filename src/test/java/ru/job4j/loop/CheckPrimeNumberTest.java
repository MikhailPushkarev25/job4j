package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;



public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean res = CheckPrimeNumber.check(5);
        assertThat(res, is(true));
    }

    @Test
    public void when4() {
        boolean res = CheckPrimeNumber.check(4);
        assertThat(res, is(false));
    }

    @Test
    public void when1() {
        boolean res = CheckPrimeNumber.check(1);
        assertThat(res, is(false));
    }
}