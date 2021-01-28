package ru.job4j.array;

public class ConcatArray {

    public static int combineSize(int[] a, int[] b) {
        int j = 0;
        for (int i = 1; i < a.length + b.length + 1; i++) {
            j = i;
        }
        return j;
    }
}
