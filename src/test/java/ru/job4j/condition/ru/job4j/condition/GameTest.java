package ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class GameTest {

    @Test
    public void checkGame() {
        int rs1 = Game.checkGame(0.2, 50, 9);
        assertThat(rs1, is(1));
    }

    @Test
    public void checkGameIsO() {
        int rs1 = Game.checkGame(0.9, 1, 2);
        assertThat(rs1, is(0));
    }
}