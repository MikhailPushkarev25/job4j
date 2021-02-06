package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 */
public class Tracker {

    /**
     * Поле items - это заявки конкретного колличества.
     */
    private final Item[] items = new Item[100];
    /**
     * Поле ids - Уникальное поле для id, то есть мы будем добавлять каждую единицу
     */
    private int ids = 1;
    /**
     * Поле size - счетчик для массива.
     */
    private int size = 0;

    /**
     * Этот метод добавляет заявки по id
     * @param item - параметр
     * @return - возарат результата
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    /**
     *  Этот метод проходит по всему массиву
     *  и добавляет не нул элементы в другой массив и вырезает с помощью
     *  Arrays.copyOf
     */

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

    /**
     * Так же метод проходит по всему массиву
     * сравнивает имя, с ключом
     * и добавляет в массив
     * далее обрезает и возвращает.
     * @param key - параметр
     * @return - возврат результата
     */
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

    /**
     * Этот метод проверяет в массиве элементы
     * сравнивает id c аргументом.
     * и возвращает item
     * @param id - параметр
     * @return - возврат результата
     */
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
