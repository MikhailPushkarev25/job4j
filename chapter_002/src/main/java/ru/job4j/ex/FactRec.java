package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В классе представлен пример рекурсивного метода,
 * оссобенность его в том что вызывает сам себя и вычисляет.
 * но есть возможность возникновения исключения StackOverFlowError -
 * переполнение области памяти stack.
 * Решение проблемы - Найти логическую ошибку в коде.
 */
public class FactRec {

    public static int calc(int n) {
        int i = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        i = calc(n - 1) * n;
        return i;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
