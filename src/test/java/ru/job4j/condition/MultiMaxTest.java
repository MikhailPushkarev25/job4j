package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenMaxThen4() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxThen8() {
        int result = MultiMax.max(8, 3, 1);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax() {
        int result = MultiMax.max(2, 3, 9);
        assertThat(result, is(9));
    }
}