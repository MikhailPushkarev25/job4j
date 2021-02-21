package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 19.02.2021
 * @version 2.2
 *
 * В классе представлен метод, который с помощью метода split делит строку
 * далее с помощью метода parseInt по первому элементу сравнивает и и вычитает потом сортирует.
 */
public class LexSoft implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
       String[] one = first.split("\\.");
       String[] two = second.split("\\.");
        return Integer.parseInt(one[0]) - Integer.parseInt(two[0]);
    }
}
