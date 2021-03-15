package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Mikhail Pushkarev", "eDer3432f"),
                new Account("142", "Mikhail Pushkarev", "000001")
        );
        HashSet<Account> expected = new HashSet<Account>(
                Set.of(
                new Account("123", "Mikhail Pushkarev", "eDer3432f"),
                new Account("142", "Mikhail Pushkarev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }

    @Test
    public void senExpectedDuplicate() {
        List<Account> accounts = List.of(
                new Account("123", "Mikhail Pushkarev", "eDer3432f"),
                new Account("142", "Mikhail Pushkarev", "000001"),
                new Account("142", "Mikhail Pushkarev", "000001")
        );
        HashSet<Account> expected = new HashSet<Account>(
                Set.of(
                        new Account("123", "Mikhail Pushkarev", "eDer3432f"),
                        new Account("142", "Mikhail Pushkarev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }
}