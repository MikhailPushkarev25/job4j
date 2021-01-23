package ru.job4j.condition.ru.job4j.condition;

public class LeapYear {

    public static boolean checkYear(int year) {
        boolean b;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}
