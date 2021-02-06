package ru.job4j.pojo;

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
