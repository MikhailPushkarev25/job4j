package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1,2,3,4};
        int[] expected = {4, 2, 3, 1};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expected));
    }

    @Test
    public void whenSwap1To3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 4, 3, 2, 5, 6};
        int[] rst = SwitchArray.swap(input, 1,3);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};
        int[] rst = SwitchArray.swap(input, 1, 2);
        assertThat(rst, is(expected));
    }
}