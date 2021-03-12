package ru.job4j.jambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Mikhail Pushkarev
 * @since 12.03.2021
 * @version 2.2
 *
 * В классе представлен метод фильтрующий школьников со средним баллом с помощью Stream API
 */
public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream().filter(predicate).collect(Collectors.toList());
    }
}
