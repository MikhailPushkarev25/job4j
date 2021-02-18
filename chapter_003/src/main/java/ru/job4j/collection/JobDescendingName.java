package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 18.02.2021
 * @version 2.2
 *
 * В классе добавлен метод сортировки по имени, убывание
 */
public class JobDescendingName implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
