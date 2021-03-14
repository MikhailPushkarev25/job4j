package ru.job4j.jambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListMatrixTest {

    @Test
    public void whenResultMatrix() {
        Integer[][] sum = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = ListMatrix.matrix(sum);
        List<Integer> expected = List.of(
                1, 2, 3, 4
        );
        assertThat(result, is(expected));
    }
}