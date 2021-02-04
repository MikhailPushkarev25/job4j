package ru.job4j.oop;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 */
public class Fix {
    /**
     * Поле для работы с обьектом
     */
    private String desc;

    /**
     * Конструктор класса, инициализирует поле.
     * @param str - записываем в аргумент строку, далее инициализируем поле
     */
    public Fix(String str) {
        this.desc = str;
    }

    /**
     * Вывод
     * @param args - args
     */
    public static void main(String[] args) {
        Fix fix = new Fix("Hello World");
        System.out.println(fix.desc);
    }
}
