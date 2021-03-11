package ru.job4j.jambda;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 */
public class Attachment {
    /**
     * В классе я создал модель данных, и поля по которым буду сортировать порядок
     */
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Attachment{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
