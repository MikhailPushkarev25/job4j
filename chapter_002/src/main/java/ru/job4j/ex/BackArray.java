package ru.job4j.ex;

import java.util.Arrays;

/**
 * @author Mikhail Pushkarev
 * @since 08.02.2021
 * @version 2.2
 * В этом классе я проверял исключение,
 * то есть изначально вышел за рамки массива.
 * с помощью IDEA - нашел ошибку и исправил ее
 */
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int i = 0; i < middle; i++) {
            String temp = names[i];
            names[i] = names[names.length - 1];
            names[names.length - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
