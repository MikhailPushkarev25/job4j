package ru.job4j.tracker;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В классе я добавил метод compare для сортировки по возрастанию
 * для этого я имплементировал интерфейс компаратор
 */
public class ItemAscendingOrder implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
