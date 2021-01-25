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
}