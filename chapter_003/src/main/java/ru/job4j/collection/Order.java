package ru.job4j.collection;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе созданна модель данных номер и имя.
 * для удобства
 */
public class Order {

    private String number;
    private String name;

    public Order(String number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(number, order.number) && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Order{" + "number='" + number + '\'' + ", name='" + name + '\'' + '}';
    }
}
