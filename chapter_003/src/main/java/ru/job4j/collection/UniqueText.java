package ru.job4j.collection;

import java.util.HashSet;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 *
 * В классе произвожу проверку идентичности слов в тексте,
 * если есть схожие слова то возвращаю true иначе false
 */
public class UniqueText {

    /**
     * Метод isEquals - принимает два параметра 1 - оригинальный текст
     *                                          2 - дубликат текста
     *  я формирую массив из текста с помощью метода split
     *  дальше создаю обьект Set
     *  первый цикл проходит по массиву и добавляет в переменную обьекта Set
     *  второй цикл проходит по  второму массиву и проверяет на идентичность слов в обоих
     *  массивах.
     * @param originText - оригинальный текст
     * @param duplicateText - дубликат
     * @return - возвращаем true если тексты схожи по словам иначе false
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String or : origin) {
            check.add(or);
        }
        for (String txt : duplicate) {
            if (!check.contains(txt)) {
                rsl = false;
            }
        }

        return rsl;
    }
}
