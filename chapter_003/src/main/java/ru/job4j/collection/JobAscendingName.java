package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 18.02.2021
 * @version 2.2
 *
 * В классе добавлен метод сортировки по имени по возрастанию
 */
public class JobAscendingName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
