package ru.job4j.collection;

import java.util.HashSet;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 *
 * В классе UsageHashSet - я показываю пример работы
 * коллекции на уникальность элементов и вывода на консоль строк.
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String in : autos) {
            System.out.println(in);
        }
    }
}
