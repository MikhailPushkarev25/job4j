package ru.job4j.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе я привожу пример кода в котором мне предсказатель
 * задает вопрос, на который я могу ответить и записать свой вопрос в консоль, далее
 * с помощью класса random, выбирает число, это число проверяется в условии if
 * тогда я получаю ответ на свой вопрос, работа класса Scanner
 */
public class MagicBall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String str = scanner.nextLine();
        System.out.println(str);
        int answer = new Random().nextInt(3);
        String line = "";
        if (answer == 0) {
            line = "Да";
        } else if (answer == 1) {
            line = "Нет";
        } else {
            line = "Моет быть";
        }
        System.out.println(line);
    }
}
