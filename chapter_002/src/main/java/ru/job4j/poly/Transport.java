package ru.job4j.poly;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * Интерфейс с тремя методами
 */
public interface Transport {

    void drive();

    void passengers(int num);

    int oil(int num);
}
