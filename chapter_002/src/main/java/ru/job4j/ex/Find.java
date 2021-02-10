package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 10.02.2021
 * @version 2.2
 *
 * В этом классе я показываю более понятный код,
 * сначала использую условие по которому падает исключение
 * далее использую полезный код.
 */
public class Find {

    public static String get(String[] data, int index) {
        String str = null;
        if (index < 0 || index > data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        str = data[index];
        return str;
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String str = Find.get(data, 1);
        System.out.println(str);
    }
}
