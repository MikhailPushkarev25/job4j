package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * Суть в том. Нужно из слов получить абривеатуру заглавных букв.
 * я использовал обьект StringfBuilder, метод append,
 * так же для сравнения верхнего регистра использовал метод
 * isUpperCase
 */
public class Abbreviation {

    public static String collect(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           if (Character.isUpperCase(s.charAt(i))) {
               str.append(s.charAt(i));
           }
        }
        return str.toString();
    }
}
