package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenIdenticalNameMikhailThenMikhail() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Mikhail", 25));
        users.add(new User("Mikhail", 21));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Mikhail", 21)));
        assertThat(it.next(), is(new User("Mikhail", 25)));
    }

    @Test
    public void whenComparePetrVsIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenEqualsMikhailThenMikhail() {
        int rsl = new User("Mikhail", 25)
                .compareTo(
                        new User("Mikhail", 21)
                );
        assertThat(rsl, greaterThan(0));
    }
}