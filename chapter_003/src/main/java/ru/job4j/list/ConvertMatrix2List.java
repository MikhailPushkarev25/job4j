package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 */
public class ConvertMatrix2List {

    /**
     * Метод toList - принимает двумерный массив,
     * далее я создал обьект листа для добавления массива,
     * но сначала я прошел по всему массиву, потом доваил в лист массив и перевел
     * в одномерный массив.
     * @param array - принимает двумерный массив
     * @return - возвращаем одномерный массив
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
