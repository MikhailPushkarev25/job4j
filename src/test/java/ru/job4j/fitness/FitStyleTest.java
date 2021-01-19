package ru.job4j.fitness;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class FitStyleTest {

    @Test
    public void whenMan() {
        String s = "We invite you";
        FitStyle.man(23);
        assertThat(s, is("We invite you"));
    }
}