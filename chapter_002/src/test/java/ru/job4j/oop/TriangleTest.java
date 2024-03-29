package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 1.0));
    }
}