package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class FindAll implements UserAction {

    private final Output out;

    public FindAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Print an element ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
       tracker.findAll(out::println);
        return true;
    }
}
