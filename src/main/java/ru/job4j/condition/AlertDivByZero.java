package ru.job4j.condition;

public class AlertDivByZero {

    public static void main(String[] args) {
        possibleDive(0);
        possibleDive(-1);
    }

    public static void possibleDive(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0");
        } else {
            System.out.println("This is negative numbers");
        }
    }
}
