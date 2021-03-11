package ru.job4j.jambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 * В классе я демонстрирую сортировку и лямбда выражения,
 * лямбда выражение  - это выражение которое можно вызвать множество раз в не блока кода,
 * так же код сводится к упрощенному и сокращенному написанию
 */
public class FI {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 132),
                new Attachment("image 2", 54),
                new Attachment("image 3", 13)
        );
        /**
         * Я создал компаратор далее указал сортировку с помощью лямбда, первая часть это параметр,
         * -> это оператор который указывает на тело, в теле я сортирую по возрастанию и убыванию.
         */
        Comparator<Attachment> comparator = (left, right) -> left.getName().compareTo(right.getName());
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comp = (left, right) -> right.getName().compareTo(left.getName());
        attachments.sort(comp);
        System.out.println(attachments);
    }
}
