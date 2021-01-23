package ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BonusCupCoffeeTest {

    @Test
    public void countCup() {
        int rst = BonusCupCoffee.countCup(7, 6);
        assertThat(rst, is(8));
    }

    @Test
    public void countCup1() {
        int rst = BonusCupCoffee.countCup(213, 6);
        assertThat(rst, is(248));
    }
 }