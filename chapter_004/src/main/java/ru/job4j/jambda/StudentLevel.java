package ru.job4j.jambda;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Mikhail Pushkarev
 * @since 14.03.2021
 * @version 2.2
 *
 * В классе я создал метод с использованием новых методов,
 * отфильтровал список без null,
 * сортировка,
 * сравнил балл студента с входным данным, если истина то проходим дальше,
 * добавляем в список
 */
public class StudentLevel {

    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((left, right) -> right.getScore() - left.getScore())
                .takeWhile(s -> s.getScore() > bound)
                .collect(Collectors.toList());
    }
}
