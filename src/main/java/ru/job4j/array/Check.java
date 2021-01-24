package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean b = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0] == data[i]) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }
}
