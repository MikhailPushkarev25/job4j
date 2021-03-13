package ru.job4j.jambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenResultAddress() {
       Address num = new Address("Kstovo", "Belinskogo", 32, 1);
       Address num2 = new Address("Nizhniy Novgorod", "Lopatina", 305, 12);
        List<Address> addresses = Profiles.collect(
                List.of(
                        new Profile(num),
                        new Profile(num2)
                )
        );
        assertThat(addresses.get(0).getCity(), is("Kstovo"));
    }

    @Test
    public void whenResultStreet() {
        List<Address> address = List.of(
               new Address("Vorotynec", "vorot", 39, 12),
               new Address("Nighniy Novgorod", "Delovay", 6, 2)
        );
        List<Address> prof = Profiles.collect(
                List.of(
                        new Profile(address.get(0))
                )
        );
        assertThat(prof.get(0).getHome(), is(39));
    }
}