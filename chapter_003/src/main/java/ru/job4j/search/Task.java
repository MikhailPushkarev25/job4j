package ru.job4j.search;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 *
 * В классе создана модель данных
 */
public class Task {

    private String desk;
    private int priority;

    public Task(String desk, int priority) {
        this.desk = desk;
        this.priority = priority;
    }

    public String getDesk() {
        return desk;
    }

    public int getPriority() {
        return priority;
    }
}
