package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int  result = right >= left ? right : left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
        result = Max.max(10, 1);
        System.out.println(result);
        result = Max.max(2, 2);
        System.out.println(result);
    }
}
