package ru.job4j.jambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 * В классе поместил в лист значения модели данных
 * для дальней сортировки
 * для сортировки я использовал анонимный класс(что бы не создавать папки и не загрязнять файлы)
 * далее я сортирую по значению, привожу пример использования анонимного класса ArrayList
 * и так же создал анонимный класс сортировки по имени.
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
               System.out.println("Add a new element to list: " + o);
               return super.add(o);
            }
        };
        list.add(100500);

        Comparator<Attachment> comp = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comp);
        System.out.println(attachments);
    }
}
