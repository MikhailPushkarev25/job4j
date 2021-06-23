package ru.job4j.jambda;

import java.util.Comparator;
import java.util.Locale;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> comp  = (left, right) -> {
            System.out.println("Compare: " + left.length() + " : " + right.length());
            return left.length() - right.length();
        };
    }
}
