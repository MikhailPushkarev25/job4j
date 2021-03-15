package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByNAme() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Mikhail", "Pushkarev", "534872", "Nizhniy Novgorod")
        );
        var persons = phones.find("Mikhail");
        assertThat(persons.get(0).getSurname(), is("Pushkarev"));
    }

    @Test
    public void whenFindBySurname() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person(
                        "Mikhail", "Pushkarev", "455555", "Vorotinec"
                )
        );
        var persons = phones.find("455555");
        assertThat(persons.get(0).getName(), is("Mikhail"));
    }

    @Test
    public void whenFindByName() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}