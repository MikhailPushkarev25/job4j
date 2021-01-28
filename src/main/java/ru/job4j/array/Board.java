package ru.job4j.array;

public class Board {

    public static int getCountRow(int[][] array) {
        int result = array.length;
        return result;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        int result = array[row][2];
        result = array.length;
        return result;
    }
}
