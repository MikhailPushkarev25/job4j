package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 * В этом классе представлен пример работы меню игры,
 * то есть пользователь запускает меню выбирает игру и она соответсвенно запускается
 *
 */
public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Игры");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.println("Введите пункт меню, что бы начать игру: ");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружаются....");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается......");
            } else {
                System.out.println("Такой игры нет");
            }
            System.out.println();
        }
    }
}
