package ru.job4j.jambda;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 13.03.2021
 * @version 2.2
 *
 * В классе я создал модель данных по адресу.
 *
 */
public class Profile {

    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Profile{" + "address=" + address + '}';
    }
}
