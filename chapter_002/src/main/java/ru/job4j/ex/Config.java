package ru.job4j.ex;

/**
 * @author Mikhail Pushkare
 * @since 10.02.2021
 * @version 2.2
 *
 * В классе так же произведен раздел полезного кода и
 * исключения для более понятной ситуации
 */
public class Config {

    public static void load(String path) {

        if (path == null) {
            throw new IllegalStateException("Path could not by null.");
        }
        System.out.println("Load config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
