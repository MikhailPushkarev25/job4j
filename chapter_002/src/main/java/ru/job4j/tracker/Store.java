package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.List;

public interface Store extends AutoCloseable {
    void init();
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    Item add(Item item) throws SQLException;
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    boolean replace(int id, Item item) throws SQLException;
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    boolean delete(int id) throws SQLException;
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    List<Item> findAll() throws SQLException;
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    List<Item> findByName(String key) throws SQLException;
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    Item findById(int id) throws SQLException;
}
