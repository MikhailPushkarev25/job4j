package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rs1 = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rs1, is(expected));
    }
}