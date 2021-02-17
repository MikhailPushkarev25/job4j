package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В классе я вызвал метод compare который принимает два параметра для сравнения,
 * далее в теле я указал первый паремтр будет сравнивать со вторым по имени.
 * для того что бы вазвать такой метод. нужно имплементировать интерфейс Comparator
 * c указанием в обобщениях класс.
 */
public class SortByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
