package ru.job4j.list;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {

    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expected = List.of(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expected));
    }

    @Test
    public void when4on4ArrayThenList8() {
        ConvertMatrix2List array = new ConvertMatrix2List();
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8
        );
        List<Integer> res = array.toList(input);
        assertThat(res, is(expected));
    }
}