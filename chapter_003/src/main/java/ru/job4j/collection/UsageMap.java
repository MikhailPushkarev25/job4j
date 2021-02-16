package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе я привожу пример добавления по ключу значения,
 * вывод ключа и значения. Удалить значение по ключу,
 * использовать для вывода метод entry.
 * Использовать одинаковые ключи и разные значения и попробоваь вывести на консоль
 * в связи с этим размер будет не 2, а 1.
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mikhail@yandex.ru", "Mikhail Pushkarev");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        map.remove("mikhail@yandex.ru");
        System.out.println();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();

        HashMap<String, String> maps = new HashMap<>();
        map.put("mikhail@yandex.ru", "Mikhail Pushkarev");
        map.put("mikhail@yandex.ru", "Mikhail Pushkarev Aleksandrovich");

        for (String key : maps.keySet()) {
            String value = maps.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
