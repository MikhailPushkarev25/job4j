package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExists() {
        boolean result = Triangle.exists(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExistsFalse() {
        boolean result = Triangle.exists(0.0, 1.0, 2.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenExist3() {
        boolean result = Triangle.exists(2.0, 2.0, 10.0);
        assertThat(result, is(false));
    }
}