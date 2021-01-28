package ru.job4j.operator;

public class Even {

    public static int ev(int a, int b) {
        int i = 0;
        if (a % 2 == 0) {
            i = a * b;
        } else {
         i = a + b;
        }
        return i;
    }

    public static void main(String[] args) {
        int result = Even.ev(2, 2);
        System.out.println(result);
        result = Even.ev(3, 5);
        System.out.println(result);
    }
}
