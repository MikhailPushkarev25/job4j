package ru.job4j.jambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 22.02.2021
 * @version 2.2
 *
 * В классе представлен пример как можно использовать
 * компаратор в виде анонимного класса и не добавлять отдельные классы
 *сортировка по значению и по имени
 * Рефакторинг  - ипользование лямбд для сокращение кода
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("Image 1", 100),
                new Attachment("Image 2", 34),
                new Attachment("Image 3", 13)
        );
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        attachments.sort(comparator);
        System.out.println(attachments);

        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list " + o);
                return super.add(o);
            }
        };
        list.add(100500);

        Comparator<Attachment> comparator1 = (left, right) -> left.getName().compareTo(right.getName());
        attachments.sort(comparator1);
        System.out.println(attachments);

        Comparator<Attachment> comparator2 = (left, right) -> right.getName().compareTo(left.getName());
        attachments.sort(comparator2);
        System.out.println(attachments);
    }
}
