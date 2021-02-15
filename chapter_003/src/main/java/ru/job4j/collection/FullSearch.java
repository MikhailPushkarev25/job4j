package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 * В классе демонстрирую работу коллекции HashSet
 */
public class FullSearch {
    /**
     * Метод extractNumber - принимает строки
     * далее проходит через цикл for each
     * и добавляет в метод add по номеру.
     * внутри метод проверяет на уникальность номеров
     * если есть копии то HashSet удаляет ее.
     * @param list - принимает строки по номеру
     * @return - Возвращает уникальные номера.
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> set = new HashSet<>();
        for (Task task : list) {
            set.add(task.getNumber());
        }
        return set;
    }
}
