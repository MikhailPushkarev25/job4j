package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 10.02.2021
 * @version 2.2
 *
 * В этом классе я проверяю что пользователь ввел строку вместо числа
 * блок try catch поймает ошибку.
 */
public class ValidateInput implements Input {
    private Output out;
    private Input in;

    public ValidateInput(Output output, Input in) {
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter validate data again");
            }
        } while (invalid);
        return value;
    }
}
