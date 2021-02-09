package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я определил наследника Exception
 * для поиска ишибки, представлеие множественного try catch
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String massage) {
        super(massage);
    }
}
