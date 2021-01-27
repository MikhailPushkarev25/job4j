package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expect = {"I", null};
        assertThat(result, is(expect));
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expect));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] except = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result, is(except));
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expect = {null, null, null};
        assertThat(result, is(expect));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(input);
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
    }
}