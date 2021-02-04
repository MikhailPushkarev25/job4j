package ru.job4j.pojo;

import java.util.Date;

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
