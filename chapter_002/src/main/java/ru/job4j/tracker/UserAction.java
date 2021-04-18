package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * Интерфейс создан для классов, реализации методов с параметрами из класса StartUI
 */
public interface UserAction {

    String name();

    boolean execute(Input input, Store tracker);
}
