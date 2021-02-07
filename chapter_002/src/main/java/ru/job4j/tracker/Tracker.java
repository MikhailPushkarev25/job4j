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
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                input[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(input, count);
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
       Item[] input = new Item[size];
       int count = 0;
       for (int i = 0; i < size; i++) {
           if (items[i].getName().equals(key)) {
               input[count++] = items[i];
           }
       }
        input = Arrays.copyOf(input, count);
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
       int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Этот метод ищет id по индексу если они равны
     * @param id - параметр
     * @return - возврат результата
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * Этот метод меняет заявку на другую при этом сохраняя старую
     * @param id - парметр
     * @param item - параметр
     * @return - возврат результата
     */
    public boolean replace(int id, Item item) {
        boolean b = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
            b = true;
        }
        return b;
    }

    /**
     * Этот метод удаляет заявку по id
     * @param id - параметр
     * @return - параметр
     */
    public boolean delete(int id) {
        boolean b = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            b = true;
        }
        return b;
    }
}
