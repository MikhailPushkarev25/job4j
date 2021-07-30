package ru.job4j.tracker;

import java.util.Scanner;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе я имплементировал методы,
 * далее перенес сканер из startUI сюда, теперь класс отвечает за консольный ввод пользователем
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
