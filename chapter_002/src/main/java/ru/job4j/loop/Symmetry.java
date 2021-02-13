package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * В этом классе метод принимает поряд  семетричных чисел
 * нам нужно перевести число в строку и разбить,
 * далее сравнить. Что я собственно и сделал
 */
public class Symmetry {

    public static boolean check(int i) {
        boolean result = true;
        String str = String.valueOf(i);
        for (int index = 0; index < (str.length() / 2); index++) {
            if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
                 result = false;
            }
        }
        return result;
    }
}
