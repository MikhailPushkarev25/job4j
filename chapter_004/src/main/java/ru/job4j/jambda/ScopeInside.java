package ru.job4j.jambda;

import java.util.function.Supplier;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 * В этом классе я исправил ошибку компиляции кода,
 * суть была в том что в не тела лямбды, мы создаем переменную соответсвенно внутри тела
 * ее изменять нельзя, я исправил эту ошибку.
 */
public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            total += add(
                    () -> num
            );
        }
        System.out.println(total);
    }

        private static Integer add(Supplier<Integer> calc) {
            return calc.get();
        }
    }
