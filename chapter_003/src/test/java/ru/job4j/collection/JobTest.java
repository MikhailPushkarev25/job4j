package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenJobDescendingByNameAndPriority() {
        Comparator<Job> jobComparator = new JobDescendingName().thenComparing(new JobDescendingPriority());
        int rsl = jobComparator.compare(
                new Job("Impl Task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobAscendingGetPriority() {
       Comparator<Job> job = new JobAscendingPriority();
       int rsl = job.compare(
               new Job("Mikhail", 1),
               new Job("Mikhail", 2)
       );
       assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscendingNameGetName() {
        Comparator<Job> job = new JobAscendingName();
        int rsl = job.compare(
                new Job("Mikhail", 20),
                new Job("Roman", 10)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescendingGetPriority() {
        Comparator<Job> job = new JobDescendingPriority();
        int rsl = job.compare(
                new Job("Roman", 20),
                new Job("Mikhail", 10)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescendingGetName() {
        Comparator<Job> job = new JobDescendingName();
        int rsl = job.compare(
                new Job("Roman", 20),
                new Job("Mikhail", 10)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobAscendingGetNameByJobAscendingGetPriority() {
        Comparator<Job> job = new JobAscendingName().thenComparing(new JobAscendingPriority());
        int rsl = job.compare(
                new Job("Mikhail", 1),
                new Job("Roman", 15)
        );
        assertThat(rsl, lessThan(0));
    }
}