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
        boolean result = false;
        String str = Integer.toString(i);
        String[] num = str.split("2");
        for (String n : num) {
            if (n.charAt(num.length) == n.charAt(num.length)) {
                 result = true;
            }
        }
        return result;
    }
}
