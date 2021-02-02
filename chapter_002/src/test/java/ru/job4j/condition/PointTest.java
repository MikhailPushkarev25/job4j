package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void testDistance3d() {
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        double d = first.distance(second);
        assertThat(d, is(1.4142135623730951));
    }

    @Test
    public void testDistance3DThatTwoPrimer() {
        Point first = new Point(1, 1, 2);
        Point second = new Point(3, 3, 4);
        double d = first.distance3d(second);
        assertThat(d, is(3.4641016151377544));
    }
}