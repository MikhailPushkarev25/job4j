package ru.job4j.collection;

import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 15.02.2021
 * @version 2.2
 * В этом классе я создал модель данных пользователя
 * так же с генерировал equals and hashcode - нужны для того что бы хранить собственные типы данных в hashset
 */
public class Account {

    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{" + "passport='" + passport + '\'' + ", username='" + username + '\'' + ", deposit='" + deposit + '\'' + '}';
    }
}
