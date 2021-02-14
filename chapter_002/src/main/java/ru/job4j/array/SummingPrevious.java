package ru.job4j.array;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 * В классе представленна программа которая суммирует первый и второй элемент,
 * сумму переносит в параметр n и тд
 */
public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int sum = a + b;
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        for (int i = 2; i < result.length; i++) {
          if (result[i] < 2) {
              result[i] = sum;
              sum += result[i];
          }
        }
        return result;
    }
}
