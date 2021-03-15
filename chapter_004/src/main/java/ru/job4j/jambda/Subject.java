package ru.job4j.jambda;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 15.03.2021
 * @version 2.2
 *
 * В классе модель данных имени и значения.
 */
public class Subject {

    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subject subject = (Subject) o;
        return score == subject.score && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
