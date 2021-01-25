package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort1() {
        int[] input = {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = {2, 4, 1, 5, 6, 10, 7, 9, 8, 3};
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expected));
    }
}