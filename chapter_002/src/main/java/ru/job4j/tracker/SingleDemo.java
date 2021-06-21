package ru.job4j.tracker;

public class SingleDemo {
    public static void main(String[] args) {
        SingleTracker tracker = SingleTracker.getTracker();
        Item item = new Item(25, "Mikhail");
        Item item1 = new Item(1, "Roman");
        System.out.println(tracker.add(item));
        System.out.println(tracker.replace(1, item1));
        System.out.println(tracker.delete(1));
    }
}
