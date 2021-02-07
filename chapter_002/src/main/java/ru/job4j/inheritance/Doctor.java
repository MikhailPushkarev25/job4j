package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean license;
    private int work;

    public boolean check() {
        return true;
    }

    public int chekWork() {
        return -1;
    }
}
