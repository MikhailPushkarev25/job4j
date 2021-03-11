package ru.job4j.jambda;

public class Job {
    private String name;
    private int size;

    public Job(String name, int size) {
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
        return "Job{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
