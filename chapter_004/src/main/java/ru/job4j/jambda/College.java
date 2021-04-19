package ru.job4j.jambda;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author Mikhail Pushkarev
 * @since 15.03.2021
 * @version 2.2
 *
 * В классе созданы методы для поиска студента по аккаунту и предмету,
 * эти методы могут вернуть NullPointer при не верном тестировании или
 * при неверном значении,
 * решение этой проблемы Otional- обертка null метод empty,
 * обертка notnull - метод of.
 *
 */
public class College {

    private final Map<Students, Set<Subject>> students;

    public College(Map<Students, Set<Subject>> students) {
        this.students = students;
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public Optional<Students> findByAccount(String account) {
        Optional<Students> rsl = Optional.empty();
        for (var stud : students.keySet()) {

            if (account.equals(stud.getAccount())) {
                rsl = Optional.of(stud);
                break;
            }
        }
        return rsl;
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Students> stud = findByAccount(account);
        if (stud.isPresent()) {
            Set<Subject> subjects = students.get(stud.get());
            for (var subj : subjects) {

                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    break;
                }
            }
        }
        return rsl;
    }
}
