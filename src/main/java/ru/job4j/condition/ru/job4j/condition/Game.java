package ru.job4j.condition.ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
       int rst = 0;
       if (prize >= pay) {
           rst = (int) (prize * percent) - pay;
       }
       return rst;
    }
}
