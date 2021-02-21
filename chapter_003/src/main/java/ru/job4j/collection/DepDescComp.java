package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 21.02.2021
 * @version 2.2
 * В клссе реализовал метод сортировки в обратном направлении,
 * по первому элементу
 *
 */
public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rst = 0;
        String[] first = o1.split("/");
        String[] second = o2.split("/");
        rst = second[0].compareTo(first[0]);
        return rst == 0 ? o1.compareTo(o2) : rst;
    }
}
