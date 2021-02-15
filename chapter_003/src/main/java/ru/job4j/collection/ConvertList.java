package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 */
public class ConvertList {

    /**
     * Метод convert - принимает несколько массивов
     * List установили обьект целочисленного массива
     * далее я прохожу по всему массиву с помщью вложенного
     * for each  и добавляю в метод add.
     * @param list - параметр с обьектом массива целочисленного
     * @return - возвращаю длину массива, из двух массивов переводим в один.
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] cell : list) {
            for (int row : cell) {
                rsl.add(row);
            }
        }
        return rsl;
    }
}
