package ru.job4j.pojo;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 * В этом классе я указываю поля, конструктор.
 * далее я создал методы гет и сет для вывода.
 */
public class People {

    /**
     * Поля для работы с обьектами.
     */
    private String name;
    private int age;

    /**
     * Конструктор для инициализации обьекта.
     * @param name - параметр
     * @param age - параметр
     */
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Так же в этом классе я переопределил метод equals
     * для сревнения ссылочных переменных
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
