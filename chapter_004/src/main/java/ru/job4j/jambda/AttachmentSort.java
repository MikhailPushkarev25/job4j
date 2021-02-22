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
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("Image 1", 100),
                new Attachment("Image 2", 34),
                new Attachment("Image 3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<Attachment>() {

            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
            }
        };
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

        Comparator<Attachment> comparator1 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
        attachments.sort(comparator1);
        System.out.println(attachments);
    }
}
