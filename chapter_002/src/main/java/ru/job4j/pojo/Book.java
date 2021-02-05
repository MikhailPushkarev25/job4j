package ru.job4j.pojo;

/**
 * @author Mikhail Pushkarev
 * @since 05.04.2021
 * @version 2.2
 * В этом классе я демонстрирую мдель данных с конструктором и гетером и сетором
 */
public class Book {
    /**
     * Поля данных
     */
    private String name;
    private int paged;

    /**
     * Конструктор
     * @param name - параметр
     * @param paged - парметр
     */
    public Book(String name, int paged) {
        this.name = name;
        this.paged = paged;
    }

    /**
     * getter and setter
     * @return - параметр
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaged() {
        return paged;
    }

    public void setPaged(int paged) {
        this.paged = paged;
    }
}
