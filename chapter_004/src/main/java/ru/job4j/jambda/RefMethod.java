package ru.job4j.jambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mikhail Pushkarev
 * @since 22.02.2021
 * @version 2.2
 *
 * В классе представлена лямбда вывод строк через форич.
 * так же сортировка инт числа через метод компаре.
 * Так же создал метод при котором если слово больше 10 то обрезаем,
 * вызово произвел с помощью лямбда
 */
public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr"
        );
        Consumer<String> consumer = System.out::println;
        names.forEach(consumer);


        @SuppressWarnings("checkstyle:EmptyLineSeparator")
        Comparator<Integer> intComp = Integer::compare;

        List<String> name = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        name.forEach(RefMethod::cutOut);
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
            }
}
