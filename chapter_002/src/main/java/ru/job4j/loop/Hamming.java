package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * В классе нужно найти разность между строками одинаковых длин
 * расстояние Хэмминга
 */
public class Hamming {

    public static int checkStrings(String left, String right) {
        int j = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                j++;
            }
        }
        return j;
    }
}
