package ru.job4j.encapsulation;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 *
 * В этом классе я использую пример инкапсуляции.
 */
public class Config {
    /**
     * Поля закрыты, в не класса их не изменить
     */
    private String name;
    private int position;
    private String[] properties;

    /**
     * Метод открыт везде для использования
     * @param name - параметр
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Метод открыт везде
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Метод открыт
     * @param key - параметр
     * @return - возврат результата
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Метод закрыт - вне класса его не изменить
     * @param key - параметр
     * @return - возвратить результат
     */
    private String search(String key) {
        return key;
    }
}
