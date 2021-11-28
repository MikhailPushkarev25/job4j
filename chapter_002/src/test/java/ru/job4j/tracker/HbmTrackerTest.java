package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HbmTrackerTest {

    @Test
    public void whenAddTracker() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item(1,"name");
        assertThat(hbmTracker.add(item).getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceTracker() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item(1, "name");
        tracker.add(item);
        item.setName("name10-000");
        tracker.replace(item.getId(), item);
        assertThat(tracker.findById(item.getId()).getName(), is(item.getName()));
    }

    @Test
    public void whenDeleteTracker() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item(1, "name");
        tracker.add(item);
        assertTrue(tracker.delete(item.getId()));
    }

    @Test
    public void whenFindAllTracker() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item(1, "name");
        Item item2 = new Item(2, "name1");
        Item item3 = new Item(3, "name2");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.findAll();
        assertThat(List.of(item, item2, item3).size(), is(3));
    }

    @Test
    public void whenFindByName() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item(1, "name");
        tracker.add(item);
        List<Item> result = tracker.findByName(item.getName());
        assertThat(result.size(), is(1));
        assertThat(result.get(0).getName(), is("name"));
        assertThat(result.get(0).getId(), is(1));
    }

    @Test
    public void whenFindById() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item(1, "name");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(1));
        assertThat(result.getName(), is("name"));
    }
}