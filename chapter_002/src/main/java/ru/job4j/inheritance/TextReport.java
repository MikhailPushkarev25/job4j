package ru.job4j.inheritance;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 *
 * В этой программе я использовал переопределение методов с использование наследования
 *
 */
public class TextReport {

    /**
     * Метод родительского класса
     * @param name - параметр
     * @param body - параметр
     * @return - возвращает результат
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
