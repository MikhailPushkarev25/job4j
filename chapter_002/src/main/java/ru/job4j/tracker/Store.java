package ru.job4j.tracker;

import java.util.List;

public interface Store extends AutoCloseable {
    void init();
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    Item add(Item item);
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    boolean replace(int id, Item item);
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    boolean delete(int id);
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    List<Item> findAll();
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    List<Item> findByName(String key);
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    Item findById(int id);
}
