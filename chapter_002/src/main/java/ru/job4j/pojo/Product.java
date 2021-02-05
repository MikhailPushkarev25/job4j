package ru.job4j.pojo;

/**
 * @author Mikhail Pushkarev
 * @since 05.02.2021
 * @version 2.2
 * Так же в этом классе демонстрию модель данных и гетер с сетором
 */
public class Product {

    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
