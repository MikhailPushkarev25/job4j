package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * @author Mihail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе показываю пример работы обьекта
 * входа данных введенных пользователем с последующим отображением на консоль
 * Scanner
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать. Как Вас зовут");
        String name = input.nextLine();
        System.out.println(name + " ,Рад Вас видеть");
    }
}
