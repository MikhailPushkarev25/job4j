package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 * В этом классе я сделал игру в 11. суть ее в следующем, два игрока берут от 1 до 3 спичек
 * кто заберет последнюю спичку тот победитель, логика кода следующая:
 * я использовал класс Scanner, далее цикл wile для неоднократного выбора спичек
 * Перевел число в строку с помощью Integer velueOf.
 * далее условие if я говорю что нужно набирать только от 1 до 3 спичек
 * иначе будет отказ и сумма спичек возвратится в исходное состаяние.
 * далее внутреннее условие if  проверяет какой игрок делает ход
 * Следующее условие if - проверяет кто победитель
 */
public class Matches {
    @SuppressWarnings("checkstyle:InnerAssignment")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " Введите число от 1 до 3: ");
            int matches = Integer.valueOf(input.nextLine());
            turn = !turn;
             count = count - matches;
            if (turn || matches == 3 || matches == 2 || matches == 1) {
                if (player.equals("Первый игрок")) {
                    System.out.println("Первый игрок взял " + matches);
                    System.out.println("Осталось " + count);
                } else {
                    System.out.println("Второй игрок взял " + matches);
                    System.out.println("Осталось " + count);
                }
            } else {
                System.out.println("Не допустимое колличество");
                count = count + matches;
            }
        }
            if (!turn) {
                System.out.println("Выиграл первый игрок.");
            } else {
                System.out.println("Выиграл второй игрок.");
            }
    }
}
