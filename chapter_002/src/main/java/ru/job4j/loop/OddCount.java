package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 11.02.2021
 * @version 2.2
 *
 * В этом классе я нашел нечетное число среди четных
 */
public class OddCount {
    public static int count(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                rsl++;
            }
        }
        return rsl;
    }
}
