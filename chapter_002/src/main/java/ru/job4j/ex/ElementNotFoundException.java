package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я сделал наследника Exception
 * далее создал конструктор для указания ошибки для понимания.
 */
public class ElementNotFoundException extends Exception {

    /**
     * Конструктор
     * @param err - параметр указания в случае падения кода.
     */
    public ElementNotFoundException(String err) {
        super(err);
    }
}
