package ru.job4j.tracker;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В этом классе я также сортирую данные но по уменьшению
 */
public class ItemDescending implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
