package ru.job4j.search;

import java.util.ArrayList;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 * В классе я создал метод добавления списка пользователя и поиск по тем символам которые
 * есть в списке.
 */
public class PhoneDictionary {
    /**
     * Поле ArrayList с типом Person
     */
    private ArrayList<Person> persons = new ArrayList<Person>();

    /**
     * Метод add - добавляет список, в поле persons.
     * @param person
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key
     * в любых полях
     * @param key - ключ поиска
     * @return Список подошедших пользователей
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person per : persons) {
            if (key.contains(per.getName()) || key.contains(per.getSurname()) || key.contains(per.getPhone()) || key.contains(per.getAddress())) {
                result.add(per);
            }
        }
        return result;
    }
}
