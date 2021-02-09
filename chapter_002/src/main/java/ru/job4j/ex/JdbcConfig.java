package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В данном классе я научился использовать класс Exception
 * и применять его в методах и указывать блок try catch
 * если пользователь не указал параметров то есть null ссылку
 * то падает исключение Exception.
 */
public class JdbcConfig {

    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        System.out.println(url);
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
