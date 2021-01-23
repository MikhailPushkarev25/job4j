package ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class HelloWordTest {

    @Test
    public void checkNumberHelloWord() {
        String s = HelloWord.checkNumber(15);
        assertThat(s, is("Hello, Word!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = HelloWord.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWord() {
        String s = HelloWord.checkNumber(25);
        assertThat(s, is("Word"));
    }

    @Test
    public void checkNumberDefault() {
        String s = HelloWord.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }
}