package ru.job4j.jambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * @author Mikhail Pushkarev
 * @since 12.03.2021
 * @version 2.2
 * В классе я сделал тесты и сравнение по баллам,
 * три теста три класса.
 */
public class SchoolTest {

    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname4", 40),
                new Student("Surname5", 50),
                new Student("Surname7", 70),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = score -> score.getScore() >= 70 && score.getScore() <= 90;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname7", 70));
        expected.add(new Student("Surname9", 90));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student("Surname2", 20),
                new Student("Surname3", 30),
                new Student("Surname5", 50),
                new Student("Surname6", 60),
                new Student("Surname8", 80)
        );
        School sc = new School();
        Predicate<Student> pr = score -> score.getScore() >= 50 && score.getScore() < 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname5", 50));
        expected.add(new Student("Surname6", 60));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname3", 30),
                new Student("Surname4", 40),
                new Student("Surname6", 60),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = score -> score.getScore() >= 0 && score.getScore() < 50;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname1", 10));
        expected.add(new Student("Surname3", 30));
        expected.add(new Student("Surname4", 40));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenFilterStudents() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname3", 30),
                new Student("Surname9", 90)
        );
        Map<String, Student> st = School.collector(students);
        Map<String, Student> expected = Map.of(
                "Surname1", new Student("Surname1", 10),
                "Surname3", new Student("Surname3", 30),
                "Surname9", new Student("Surname9", 90)
        );
        assertThat(st, is(expected));

    }
}