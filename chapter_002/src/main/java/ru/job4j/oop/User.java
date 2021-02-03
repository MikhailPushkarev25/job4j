package ru.job4j.oop;

/**
 * @author Mikhail Pushkarev
 * @since 03.02.2021
 * @version 2.2
 */
public class User {
    /**
     * Поле обьекта мы обьявляем в теле класса
     * и работать можем только с обьектом
     */
    private String name; // Поле обьекта
    private int age; // Поле обьекта

    public boolean canDrive() {
        boolean can = false; // Локальная переменная
        /*
        Локальную переменную мы обьявляем в теле метода,
        работать с ней можем внутри метода
         */
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
