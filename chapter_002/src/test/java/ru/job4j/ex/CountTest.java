package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я использовал в тестах проверку на исключение IllegalArgumentException
 * и тест с положительным исходом.
 */
public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }

    @Test
    public void when0To2then3() {
        int rsl = Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}