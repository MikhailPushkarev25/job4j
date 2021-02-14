package ru.job4j.collection;

import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @since 2.2
 *
 */
public class ConvertList2Array {

    /**
     * Метод должен из одномерного массива составить двумерный
     * c помощью класса Math я делю длину массива на cells в большую сторону
     * далее прохожу по всему массиву
     * увеличиваю строку потом обнуляю и повторяю действия до конца
     * @param list - длина массива
     * @param cells - строка массива из 3х
     * @return - вернуть результат
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell++] = num;
            if (cell == cells) {
                row++;
                cell = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
