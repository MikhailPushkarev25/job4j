package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 *
 * В этом классе я привел пример Модели данных, модель на языке программирования
 * это кода мы записываем информацию и читаем, в классе использовал get and set
 */

public class License {

    private String owner;
    private String model;
    private String code;
    private Date created;

    /**
     * В данном клаассе я переопределил метод, для сравнения обьектов
     * @param o - сравнение ссылок
     * @return - вернуть
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner) && Objects.equals(model, license.model) && Objects.equals(code, license.code) && Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
