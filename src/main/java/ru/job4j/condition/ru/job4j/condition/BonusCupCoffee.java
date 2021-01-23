package ru.job4j.condition.ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int res = 0;
        if (count > n) {
            res = count / n;
            res = res + count;
        }
        return res;
    }
}
