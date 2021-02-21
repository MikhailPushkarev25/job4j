package ru.job4j.collection;

import java.util.*;

/**
 * @author Mikhail Pushkarev
 * @since 21.02.2021
 * @version 2.2
 * В классе представлены методы, метод fillGaps - проходит по массиву далле с помощью
 * метода split разделяем подразделения на элементы
 * и добавляем их в сэт(уникальные подразделения)
 * метод sortAsc - сортирует подразделения по возрастанию
 * с помощью меиода naturalOrder
 * метод sortDesc - сортирует подразделения в обратном порядке
 * я создал дополнительный класс для разработки сортировки
 */
public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                    start = start + el;
                    tmp.add(start);
                    start += "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
