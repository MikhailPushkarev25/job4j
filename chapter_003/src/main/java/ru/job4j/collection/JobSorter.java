package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 17.02.2021
 * @version 2.2
 *
 * В классе демонстрирую работу сортировки по возрастанию,
 * для этого вызвал метод sort.
 * так же добавил параметр для сортировки по имени
 */
public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        System.out.println();
        /**
         * инструмент обьединение сортировки по полям, (возрастание и убывание)
         */
        Comparator<Job> comb = new JobAscendingName()
                .thenComparing(new JobAscendingPriority())
                .thenComparing(new JobDescendingName())
                .thenComparing(new JobDescendingPriority());
        Collections.sort(jobs, comb);
    }
}
