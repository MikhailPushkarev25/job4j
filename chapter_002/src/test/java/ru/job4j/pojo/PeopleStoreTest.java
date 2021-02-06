package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PeopleStoreTest {

    @Test
    public void testIndexOfNull() {
        People[] people = new People[5];
        people[0] = new People("Mikhail", 25);
        people[1] = new People("Roman", 28);
        people[2] = new People("Lena", 35);
        int rsl = PeopleStore.indexOfNull(people);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        People[] people = new People[5];
        people[1] = new People("Roman", 28);
        int rsl = PeopleStore.indexOfNull(people);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        People[] people = new People[1];
        people[0] = new People("Mikhail", 25);
        int rsl = PeopleStore.indexOfNull(people);
        assertThat(rsl, is(-1));
    }

}