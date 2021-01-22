package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MidWeithLoopTest {

    @Test
    public void test() {
        assertEquals(0, MidWeithLoop.mod(4, 2));
        assertEquals(1, MidWeithLoop.mod(3, 2));
        assertEquals(2, MidWeithLoop.mod(8, 3));
        assertEquals(0, MidWeithLoop.mod(0, 3));
    }
}