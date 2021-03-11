package ru.job4j.jambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 * В классе представлен метод, первые два параметра - это диапазон значений,
 * третий это функция лямбда.
 * нам нужно линейную, на себя умножить, и квадратичную функцию , в тестах я проверил
 * все три вычисления.
 */
public class LambdaRange {

    public static List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(function.apply((double) i));
        }
        return list;
    }
}
