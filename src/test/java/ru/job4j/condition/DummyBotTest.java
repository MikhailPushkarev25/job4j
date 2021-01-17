package ru.job4j.condition;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreenBoot() {
        DummyBot.answer("Привет, бот");
        is("Привет, умник");
    }

    @Test
    public void whenByeBoot() {
        DummyBot.answer("Пока.");
        is("До скорой встречи.");
    }

    @Test
    public void whenUnknownBoot() {
        DummyBot.answer("Сколько будет 2+2.");
        is("Это ставит меня в тупик. задайте другой ворос");
    }
}