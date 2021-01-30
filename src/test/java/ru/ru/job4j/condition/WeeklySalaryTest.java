package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class WeeklySalaryTest {

    @Test
    public void calculateIs400() {
        int[] input = {8, 8, 8, 8, 8, 0, 0};
        int result = WeeklySalary.calculate(input);
        assertThat(result, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] input = {10, 10, 10, 0, 8, 0, 0};
        int result = WeeklySalary.calculate(input);
        assertThat(result, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] input = {10, 0, 12, 0, 8, 12, 4};
        int result = WeeklySalary.calculate(input);
        assertThat(result, is(690));
    }
}