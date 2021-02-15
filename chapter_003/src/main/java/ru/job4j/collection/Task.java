package ru.job4j.collection;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 *
 * В классе создана модел данных - номер и задача к примеру
 * мы по номеру будем искать задачу, если есть идентичный номер то удаляем.
 */
public class Task {

    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
