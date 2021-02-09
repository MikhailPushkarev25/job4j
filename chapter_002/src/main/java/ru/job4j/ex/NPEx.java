package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 * В этом классе я проверяю массив на исключение NullPointerException
 * проверяю в условии if
 * далее выводим на консоль.
 */
public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Mikhail Pushkarev";
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null) {
                System.out.println(el + " has a size " + el.length());
            }
        }
    }
}
