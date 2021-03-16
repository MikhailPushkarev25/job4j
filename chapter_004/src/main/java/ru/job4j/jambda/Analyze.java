package ru.job4j.jambda;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mikhail Pushkarev
 * @since 16.03.2021
 * @version 2.2
 *
 * Класс получет статистику по аттестатам
 */
public class Analyze {
    /**
     * Метод вычисляет общий средний балл
     * @param stream - поток
     * @return - вернуть средний балл
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(
                s -> s.getSubjects().stream()
        ).mapToInt(Subject::getScore)
                .average().orElse(0D);
    }

    /**
     * Метод вычисляет средний балл ученика по его предметам
     * @param stream - поток
     * @return - возвращает список из обьекта Tuple
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(m -> new Tuple(m.getName(),
                (m.getSubjects().stream())
        .mapToInt(Subject::getScore)
        .average()
        .orElse(0D))).collect(Collectors.toList());
    }

    /**
     * Метод вычисляет средний балл по всем предметам для каждого ученика
     * @param stream - поток
     * @return - возвращяет список из обьекта Tuple
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(
                s -> s.getSubjects().stream()
        ).collect(Collectors.groupingBy(Subject::getName,
                LinkedHashMap::new,
                Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(m -> new Tuple(m.getKey(), m.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод возвращает лучшего ученика, Лучшим считается ученик с наибольшим баллом по всем предметам
     * @param stream - поток
     * @return - возвращает лучшего ученика
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(m -> new Tuple(m.getName(),
                (m.getSubjects().stream())
        .mapToInt(Subject::getScore).sum()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    /**
     * Метод  возвращает предмет с наибольшим баллом для всех студентов
     * @param stream - поток
     * @return - возвращает обьект Tuple
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(
                s -> s.getSubjects().stream()
        ).collect(Collectors.groupingBy(Subject::getName,
                Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(m -> new Tuple(m.getKey(), m.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }
}
