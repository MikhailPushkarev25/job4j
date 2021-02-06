package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] input = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                input[size] = items[i];
                size++;
            }
        }
        input = Arrays.copyOf(input, size);
        return input;
    }

    public Item[] findByName(String key) {
       Item[] input = new Item[items.length];
       for (int i = 0; i < items.length; i++) {
           if (key.equals(items[i].getName())) {
               input[size++] = items[i];
               size++;
           }
       }
        input = Arrays.copyOf(input, size);
       return input;
    }

    public Item findById(int id) {
        Item item = null;
        for (int i = 0; i < size; i++) {
            if (id == items[i].getId()) {
                item = items[i];
                break;
            }
        }
        return item;
    }
}
