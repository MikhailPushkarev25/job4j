package ru.job4j.collection;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В классе я создал модель данных, имя работы, приоритет имени.
 * далее я имплементировал интерфейс компарэбл, для сортировки имени по прриоритету
 * по возрастанию
 */
public class Job implements Comparable<Job> {

    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\'' + ", priority=" + priority + '}';
    }

    @Override
    public int compareTo(Job o) {
        return Integer.compare(priority, o.priority);
    }
}
