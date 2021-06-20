package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 */
public class MemTracker implements Store {

    /**
     * Поле items - это заявки определенного колличества.
     */
    private final List<Item> list = new ArrayList<>();
    /**
     * Поле ids - Уникальное поле для id, то есть мы будем добавлять каждую единицу
     */

    private int ids = 1;

    @Override
    public void init() {

    }

    /**
     * Этот метод добавляет заявки по id
     * @param item - параметр
     * @return - возарат результата
     */
    public Item add(Item item) {
        item.setId(ids++);
        list.add(item);
        return item;
    }
    /**
     *  Этот метод проходит по всему массиву
     *  и добавляет не нул элементы в другой массив и вырезает с помощью
     *  Arrays.copyOf
     */

    public List<Item> findAll() {
        return list;
    }

    /**
     * Так же метод проходит по всему массиву
     * сравнивает имя, с ключом
     * и добавляет в массив
     * далее обрезает и возвращает.
     * @param key - параметр
     * @return - возврат результата
     */
    public List<Item> findByName(String key) {
       List<Item> input = new ArrayList<>();
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getName().equals(key)) {
                input.add(list.get(i));
           }
       }
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
        return index != -1 ? list.get(index) : null;
    }

    /**
     * Этот метод ищет id по индексу если они равны
     * @param id - параметр
     * @return - возврат результата
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
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
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            list.set(index, item);
        }
        return rsl;
    }

    /**
     * Этот метод удаляет заявку по id
     * @param id - параметр
     * @return - параметр
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            list.remove(index);
        }
        return rsl;
    }

    /**
     * Метод для сортировки данных по возрастанию
     */
    public void ascending() {
        Collections.sort(list, new ItemAscendingOrder());
    }

    /**
     * Метод сортировки по уменьшению
     */
    public void descending() {
        Collections.sort(list, new ItemDescending());
    }

    @Override
    public void close() throws Exception {

    }
}
