package ru.job4j.oop;

/**
 * @author Mikhail Pushkarev
 * @since 02.02.2021
 * @version 2.2
 *
 * В этом классе я использую принципы ООП, с помощью которых сделал рефакторинг кода.
 */

public class MultiMAx {

    /**
     * Метод максимум из двух чисел.
     * @param first - первый аргумент
     * @param second - второй аргумент.
     * @return - Вернуть результат.
     */

    public static int max(int first, int second) {
        int result = 0;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }

    /**
     * Метод максимум из 3-х чисел.
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @param third - третий аргумент
     * @return - вернуть результат.
     */
    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );

    }

    /**
     * Метод максимум из 4-х чисел
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @param third - третий аргумент
     * @param hour - четвертый аргумент
     * @return - вернем результат
     */
    public static int max(int first, int second, int third, int hour) {
        int i = max(third, hour);
        int j = max(first, second, i);
        return j;
    }

    }

