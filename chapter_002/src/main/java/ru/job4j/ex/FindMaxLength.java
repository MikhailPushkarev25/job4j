package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @since 2.2
 *
 * В этом классе я проверяю исключение на NullPointerException
 * что бы исключить ошибку, нужно проверить что в массиве нет пустой ячейки,
 * даллее проверяем в каком слове больше символов, выводим на консоль.
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null) {
                if (el.length() > max) {
                    max = el.length();
                }
            }
        }
        System.out.println("Max length " + max);
    }
}
