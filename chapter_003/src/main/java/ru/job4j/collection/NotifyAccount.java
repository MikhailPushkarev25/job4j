package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 */
public class NotifyAccount {

    /**
     * Метод sent - принимает данные о пользователе по паспортным данным
     * то есть происходит рассылка писем клиенту, по этим данным
     * @param accounts - принимает данные
     * @return - возвращает результат
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account act : accounts) {
            rsl.add(act);
        }
        return rsl;
    }
}
