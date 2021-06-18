package ru.job4j.array;

public class ArrayNumber {

    public static void main(String[] args) {
        int[][] num = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < num.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + num[i].length
            );
        }
    }
}
