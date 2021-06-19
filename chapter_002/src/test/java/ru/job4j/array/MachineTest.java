package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when50By35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when50By21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when50By32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertArrayEquals(expected, result);
    }
}