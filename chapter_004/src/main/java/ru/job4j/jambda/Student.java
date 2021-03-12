package ru.job4j.jambda;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 12.03.2021
 * @version 2.2
 *
 *  В классе представлена модель данных, сортировка школьников классов по среднему баллу.
 */
public class Student {

    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
