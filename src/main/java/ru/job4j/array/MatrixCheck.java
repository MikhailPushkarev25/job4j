package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = row; i < board.length; i++) {
           if (board[i][row] == 'X') {
               result = true;
               break;
           }
        }
        return result;
    }
}
