package ru.job4j.tracker;

import java.time.LocalDateTime;

/**
 * @author Mikhail Pushkarev
 * @since 06.2021
 * @version 2.2
 * Это модель данных
 * содержит всю необходимую информацию
 * найти можно с пощью класса tracker
 */
public class Item {

    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}
