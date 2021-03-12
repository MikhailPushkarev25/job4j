package ru.job4j.jambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mikhail Pushkarev
 * @since 12.03.2021
 * @version 2.2
 *
 * В этом классе я создал так же внутренний класс и в нем модель данных с числами.
 * далее в методе main - записал в лист числа и отфильтровал их по положительным,
 * далее вывел на консоль
 */
public class UsageStr {

    public static class Number {
        private final int num;

        public Number(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Number{" + "num=" + num + '}';
        }
    }
    public static void main(String[] args) {
        List<Number> num = Arrays.asList(
                new Number(1),
                new Number(2),
                new Number(-3),
                new Number(-10),
                new Number(4)
        );

        List<Number> result = num.stream().filter(
                res -> res.num >= 0
        ).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
