package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then3() {
        int[] input = {2, 3, 5, 6, 1, 9};
        int value = 6;
        int  result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNot() {
        int[] input = {3, 4, 5};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 5;
        int start = 3;
        int finish = 9;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotNumber() {
        int[] input = {4, 3, 7, 1, 9, 2};
        int value = 10;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}