package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int res = Fitness.calc(95, 90);
        assertThat(res, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int res = Fitness.calc(90, 95);
            assertThat(res, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int res = Fitness.calc(50, 90);
        assertThat(res, is(2));
    }
}