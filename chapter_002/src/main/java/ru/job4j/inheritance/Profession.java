package ru.job4j.inheritance;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 */

/**
 * В этой программе я демонстрирую принцип ООП
 * Наследование.
 * я создал класс Profession, наследники класса Doctor, Engineer - описывают лицензию и опыт работы врачом
 * наследники класса Doctor - Surgeon, Optometrist - описывают кто на должности мужчина или женщина
 * Engineer - описывает какая профессия.
 * Наследники класса Engineer - Programmer, Designer - описывают на какой стадии находится сотрудник и
 * какая должность конструктора.
 */
public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
