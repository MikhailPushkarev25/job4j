package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = first;
        } else if (second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}
