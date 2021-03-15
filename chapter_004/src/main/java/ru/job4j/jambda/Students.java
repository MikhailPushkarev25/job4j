package ru.job4j.jambda;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 15.03.2021
 * @version 2.2
 *
 * В классе я создал модель данных студента,
 * имя, аккаунт, группа
 */
public class Students {

    private String name;
    private String account;
    private String group;

    public Students(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Students students = (Students) o;
        return Objects.equals(name, students.name) && Objects.equals(account, students.account) && Objects.equals(group, students.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, account, group);
    }
}
