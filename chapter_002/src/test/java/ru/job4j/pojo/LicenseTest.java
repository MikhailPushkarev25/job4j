package ru.job4j.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setModel("Mitsubishi");
        License second = new License();
        second.setModel("Mitsubishi");
        assertThat(first, is(second));

    }
}