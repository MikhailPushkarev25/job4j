package ru.job4j.loop;

public class MidWeithLoop {
    public static int mod(int n, int d) {
        int i = 0;
        while (n >= d) {
            n = n - d;
            i = n;
        }
        return i;
    }
}
