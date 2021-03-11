package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByNAme() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Mikhail", "Pushkarev", "534872", "Nizhniy Novgorod")
        );
        ArrayList<Person> persons = phones.find("Mikhail");
        assertThat(persons.get(0).getSurname(), is("Pushkarev"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person(
                        "Mikhail", "Pushkarev", "455555", "Vorotinec"
                )
        );
        ArrayList<Person> persons = phones.find("455555");
        assertThat(persons.get(0).getName(), is("Mikhail"));
    }

    @Test
    public void whenFindByName() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}