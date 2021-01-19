package ru.job4j.operator;

public class Sum {

    public static int summation(int a, int b, int c) {
        int i = 0;
        if (a >= 0) {
            i = a + a;
        } else if (b >= 0) {
            i = b + b;
        } else if (c >= 0) {
            i = c + c;
        }
        return i;
    }
    public static void main(String[] args) {
        int result = Sum.summation(-1, 2, -7);
        System.out.println(result);
        result = Sum.summation(1, -2, -7);
        System.out.println(result);
        result = Sum.summation(-1, -2, 7);
        System.out.println(result);
        System.out.println();
        result = Sum.summation(-2, 3, -4);
        System.out.println(result);
    }
}
