package ru.job4j.loop;

/**
 * @author Mikhail Pushkaev
 * @since 13.02.2021
 * @version 2.2
 *
 * В этом классе нужно суммировать только каждые вторые числа по циклу,
 * включая первое число
 */
public class SecondSum {

    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i = i + 2) {
               result = result + i;
        }
        return result;
    }
}
