package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class OddCountTest {

    @Test
    public void count() {
        int b = 6;
        int a = 4;
        int result = OddCount.count(a, b);
        assertThat(result, is(5));
    }
}