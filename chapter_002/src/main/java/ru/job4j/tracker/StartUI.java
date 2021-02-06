package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 * Этот класс показывает как по id найти имя
 */
public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
       String str = "Mikhail";
       item.setName(str);
       tracker.add(item);
       System.out.println(tracker.findById(1).getName());
    }
}
