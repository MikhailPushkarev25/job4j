package ru.job4j.array;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 *
 * В этом массиве я составил треугольную матрицу
 */
public class TriangleMatrix {

    public static int[][] rows(int count) {
        int res = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
           for (int j = 0; j <= i; j++) {
               triangle[i][j] = res++;
           }
        }
        return triangle;
    }
}
