package ru.job4j.jambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 *
 * В класе я показал пример использования функции высшего порядка,
 * то есть композиуию, создал два класса сортировки по имени и значению.
 * я вычислил имя и значение, уже потом скомбинировал функции.
 */
public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);

        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparing(Job::getSize);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);
        jobs.sort(combine);
    }
}
