package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
           if (board[i][row] == 'X') {
               result = true;
               break;
           }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[column][i] != 'X') {
                result = true;
            }
        }
        return result;
    }
}
