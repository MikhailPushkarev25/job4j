package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenAscendingTrackerThenItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Nikolay");
        Item item1 = new Item("elena");
        Item item2 = new Item("mikhail");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.ascending();
        List<Item> input = tracker.findAll();
        assertThat(input.get(0).getName(), is(item.getName()));
        assertThat(input.get(1).getName(), is(item1.getName()));
        assertThat(input.get(2).getName(), is(item2.getName()));
    }

    @Test
    public void whenDescendingTrackerThenItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("mikhail");
        Item item1 = new Item("elena");
        Item item2 = new Item("Nikolay");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.descending();
        List<Item> input = tracker.findAll();
        assertThat(input.get(0).getName(), is(item.getName()));
        assertThat(input.get(1).getName(), is(item1.getName()));
        assertThat(input.get(2).getName(), is(item2.getName()));
    }
}