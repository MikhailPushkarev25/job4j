package ru.job4j.pojo;

import java.util.Date;

/**
 * В классе присутствует метод main для демонстрации модели
 */
public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Mikhail Pushkarev");
        license.setModel("Mitsubishi");
        license.setCode("xx001x152");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
