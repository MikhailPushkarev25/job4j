package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе так же использовал исключение IllegalArgumentException
 * при использовании отрицательных чисел, и дополнительный тест
 * на факториал числа.
 */
public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentNumberNegative() {
        Fact.calc(-2);
    }

    @Test
    public void whenFactorialTo4() {
        int rsl = Fact.calc(4);
        assertThat(rsl, is(24));
    }
}