package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 18.02.2021
 * @version 2.2
 * В классе создан метод сортировки по приоритету, возрастание.
 */
public class JobAscendingPriority implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
