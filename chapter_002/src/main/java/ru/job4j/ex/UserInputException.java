package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я сделал наследника Exception
 * с параметром строки, для указания ошибки
 */
public class UserInputException extends Exception {

    public UserInputException(String massage) {
        super(massage);
    }
}
