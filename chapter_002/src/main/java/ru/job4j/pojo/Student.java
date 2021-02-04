package ru.job4j.pojo;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 *
 * В этом классе так же есть модель данных и гетер, сетер
 */
public class Student {

    private String name;
    private String patronymic;
    private String surname;
    private String group;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
