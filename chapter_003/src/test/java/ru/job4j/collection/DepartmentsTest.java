package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAscDepartment() {
        List<String> input = List.of("K1/SK1", "K1", "K2/SK2", "K2");
        List<String> expected = List.of("K1", "K1/SK1", "K2", "K2/SK2");
        Departments.sortAsc(input);
        assertThat(input, is(expected));
    }

    @Test
    public void whenDescDepartment() {
        List<String> input = List.of("K1", "K1/SSK2", "K2", "K2/SSK2");
        List<String> expected = List.of("K2", "K2/SSK2", "K1", "K1/SSK2");
        Departments.sortDesc(input);
        assertThat(input, is(expected));
    }
}