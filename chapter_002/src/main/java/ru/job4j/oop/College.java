package ru.job4j.oop;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе происходит повышение типов обьктов
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Students st = freshman;
        Object obj = freshman;

    }
}
