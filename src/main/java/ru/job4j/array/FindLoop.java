package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rs1 = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rs1 = i;
                break;
            }
        }
        return rs1;
    }
}
