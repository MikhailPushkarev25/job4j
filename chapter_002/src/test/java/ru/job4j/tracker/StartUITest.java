package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix Pc"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix Pc");
        assertThat(created.getName(), is(expected.getName()));
    }
}