package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 */
public class Item {

    /**
     * Поля для работы с обьектами
     */
    private String name;
    private int id;

    /**
     * Конструкторы которые я перегрузил, так же проиницилизировал поля.
     */
    public Item() {

    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
      Item item = new Item();
      Item item1 = new Item(1);
      Item item2 = new Item(2, "Two");
    }
}
