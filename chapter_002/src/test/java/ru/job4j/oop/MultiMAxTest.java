package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

 public class MultiMAxTest {

    @Test
    public void testMax() {
        int res = MultiMAx.max(1, 2);
        int expected = 2;
        assertThat(res, is(expected));
    }

    @Test
     public void testMax2() {
        int res = MultiMAx.max(3, 2, 1);
        assertThat(res, is(3));
    }

    @Test
     public void testMax3() {
        int res = MultiMAx.max(2, 3, 1);
        assertThat(res, is(3));
    }

    @Test
     public void testMax4() {
        int res = MultiMAx.max(1, 2, 3);
        assertThat(res, is(3));
    }

    @Test
     public void testMax5() {
        int res = MultiMAx.max(1, 2, 3, 4);
        assertThat(res, is(4));
    }

    @Test
     public void testMax6() {
        int res = MultiMAx.max(1, 2, 4, 3);
        assertThat(res, is(4));
    }

    @Test
     public void testMax7() {
        int res = MultiMAx.max(10, 2, 1, 3);
        assertThat(res, is(10));
    }

    @Test
     public void testMax8() {
        int res = MultiMAx.max(1, 50, 2, 3);
        assertThat(res, is(50));
    }
}