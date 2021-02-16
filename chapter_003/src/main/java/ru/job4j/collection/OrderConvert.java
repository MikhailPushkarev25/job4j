package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе представлена конвертация интерфейса List в Map.
 * Для удобства поиска заявок по ключу.
 */
public class OrderConvert {
    /**
     * Метод process - принимает список заявок,
     * далее проходит по всему списку с помощью for each
     * и добавляем в mup.
     * @param orders - Принимает список заявок
     * @return - возвращает заявку по ключу.
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order key : orders) {
            map.put(key.getNumber(), key);
        }
        return map;
    }
}
