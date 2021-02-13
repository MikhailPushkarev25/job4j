package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * Мы очень часто используем карту для оплаты в магазинах,
 * и когда берем чек то видим что строка из # кроме последних 4х цифр
 * это наш номер карты и я продемонстрировал код что бы скрыть цифры за решеткой
 * кроме последних 4 цифр
 */
public class Cryptography {

    public static String code(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String str = "";
        if (s.equals(str)) {
            return "empty";
        }
        if ((s.length() > 0) && (s.length() <= 4)) {
            return s;
        }
        for (int i = 0; i < 12; i++) {
            stringBuilder.setCharAt(i, '#');
        }
        str = stringBuilder.toString();

            return str;

    }
}
