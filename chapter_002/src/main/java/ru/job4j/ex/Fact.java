package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я использовал класс который описывает исключение
 * IllegalArgumentException
 * в данном методе если пользователь укажет отрицательное число
 * метод упадет с ошибкой.
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(-2));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The argument specifies a negative number");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
