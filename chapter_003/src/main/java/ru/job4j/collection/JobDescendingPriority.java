package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 18.02.2021
 * @version 2.2
 *
 * В классе создан метод метод сортировки по приоритету, убывание
 */
public class JobDescendingPriority implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
