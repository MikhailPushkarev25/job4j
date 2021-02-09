package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 * В этом классе я создал наследника UserNotFoundException
 * для примера множественного try catch
 */
public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String massage) {
        super(massage);
    }
}
