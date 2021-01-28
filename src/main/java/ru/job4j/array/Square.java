package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] rs1 = new int[bound];
        for (int i = 0; i < rs1.length; i++) {
            rs1[i] = i * i;
        }
        return rs1;
    }

    public static void main(String[] args) {
        int[] result = Square.calculate(4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
