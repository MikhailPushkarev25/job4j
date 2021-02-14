package ru.job4j.collection;

import java.util.ArrayList;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 *
 * В этом классе я привел пример добавления и вывода данных на консоль
 * с помощью класса ArrayList
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
