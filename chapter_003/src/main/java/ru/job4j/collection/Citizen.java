package ru.job4j.collection;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе я создал модель данных полльзвателя (фамилия и его номер паспорта)
 */
public class Citizen {

    private String passport;
    private String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Citizen{" + "passport='" + passport + '\'' + ", username='" + username + '\'' + '}';
    }
}
