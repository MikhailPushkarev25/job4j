package ru.job4j.tracker;

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
}
