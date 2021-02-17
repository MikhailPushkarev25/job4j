package ru.job4j.collection;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В классе создана модель данных имени и возраста,
 * так же я добавил интерфейс comparable
 * для сравнения возраста.
 * Но у нас может м быть такое что имена одинаковые,
 * поэтому я добавил логику сравнения имен в метод compareTo
 * если имена равны, это 0, то мы сравниваем возраст.
 */
public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        int i = name.compareTo(o.name);
        if (i == 0) {
           i =  Integer.compare(age, o.age);
        }
        return i;
    }
    }
