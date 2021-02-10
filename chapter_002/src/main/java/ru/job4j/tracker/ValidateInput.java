package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 10.02.2021
 * @version 2.2
 *
 * В этом классе я проверяю что пользователь ввел строку вместо числа
 * блок try catch поймает ошибку.
 */
public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter validate data again");
            }
        } while (invalid);
        return value;
    }
}
