package ru.job4j.tracker;
import java.util.List;

public final class SingleTracker {

    private final MemTracker tracker = new MemTracker();

    private static SingleTracker single = null;

    private SingleTracker() {

    }

    public static SingleTracker getTracker() {
        if (single == null) {
            single = new SingleTracker();
        }
        return single;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public void findAll() {
         single.findAll();
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
