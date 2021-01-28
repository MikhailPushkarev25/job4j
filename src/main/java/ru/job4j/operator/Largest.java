package ru.job4j.operator;

public class Largest {

    public static int max(int first, int second) {
        int res = 0;
        if (first > second) {
            res = first;
        } else {
            res = second;
        }
        return res;
    }

    public static int whenMax(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        if (second < third) {
            result = third;
        }
        return result;
    }

    public static int whenMaxRes(int first, int second, int third, int four) {
       int result = 0;
       if (first > second) {
           result = first;
       } else if (second > third) {
           result = second;
       } else if (third > four) {
           result = third;
       } else {
           result = four;
       }
        return result;
    }

    public static void main(String[] args) {
        int result = Largest.max(1, 2);
        System.out.println(result);
        result = Largest.max(2, 1);
        System.out.println(result);
        result = Largest.max(1, 1);
        System.out.println(result);
        System.out.println();
        result = Largest.whenMax(1, 2, 3);
        System.out.println(result);
        result = Largest.whenMax(3, 2, 1);
        System.out.println(result);
        result = Largest.whenMax(1, 3, 2);
        System.out.println(result);
        result = Largest.whenMax(1, 1, 1);
        System.out.println(result);
        System.out.println();
        result = Largest.whenMaxRes(1, 2, 3, 4);
        System.out.println(result);
        result = Largest.whenMaxRes(2, 2, 4, 3);
        System.out.println(result);
        result = Largest.whenMaxRes(4, 2, 3, 1);
        System.out.println(result);
        result = Largest.whenMaxRes(2, 4, 1, 3);
        System.out.println(result);
        result = Largest.whenMaxRes(1, 1, 2, 2);
        System.out.println(result);
    }
}
