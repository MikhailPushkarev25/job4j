package ru.job4j.condition;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * В этом классе нужно проверить строку на идентичность
 * так же что строки пустые,
 * я применил метод equals, xharAT
 */
public class PairsCharString {

    public static boolean check(String l, String r) {
        boolean result = false;
        if (l.equals(r) || l.charAt(0) == r.charAt(5)) {
                    result = true;
                }
        return result;
    }
}
