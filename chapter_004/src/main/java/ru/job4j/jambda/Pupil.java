package ru.job4j.jambda;

import java.util.List;
import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 16.03.2021
 * @version 2.2
 *
 * В классе создана модель, описывает ученика
 */
public class Pupil {

    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pupil pupil = (Pupil) o;
        return Objects.equals(name, pupil.name) && Objects.equals(subjects, pupil.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjects);
    }
}
