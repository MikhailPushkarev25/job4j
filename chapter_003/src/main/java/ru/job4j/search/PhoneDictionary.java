package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

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
     * В методе приведен пример комбинированной функцции
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineAddress = x -> x.getAddress().contains(key);
        Predicate<Person> combinePhone = x -> x.getPhone().contains(key);
        Predicate<Person> combineName = x -> x.getName().contains(key);
        Predicate<Person> combineSurname = x -> x.getSurname().contains(key);
        Predicate<Person> comb = combineAddress.or(combinePhone).or(combineName).or(combineSurname);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (comb.test(person)) {
                result.add(person);
            }
        }

        return result;
    }
}
