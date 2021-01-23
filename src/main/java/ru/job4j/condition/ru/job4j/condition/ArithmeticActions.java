package ru.job4j.condition.ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rst) {
        String result = "";
        if (left + right == rst) {
            result = "added";
        } else if (left - right == rst) {
            result = "subtracted";
        } else if (left * right == rst) {
            result = "multiplied";
        } else if (left / right == rst) {
            result = "divided";
        } else {
            result = "none";
        }
        return result;
    }
}
