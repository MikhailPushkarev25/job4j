package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе я создал поле обьекта Map.
 *
 */
public class PassportOffice {

    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод add - проверяет что пользователя с таким паспортом еще нет
     * если нет то true, иначе false
     * @param citizen - принимает информацию о пользователе
     * @return - вернуть true если нет такого пользователя с паспортом
     * иначе false;
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getUsername())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод get - возвращает пользователя по номеру паспорта
     * @param passport - принимает номер паспорта
     * @return - возвращает результат
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
