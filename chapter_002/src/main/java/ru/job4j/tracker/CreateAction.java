package ru.job4j.tracker;

import java.sql.SQLException;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class CreateAction implements UserAction {

    private final Output output;

    public CreateAction(Output output) {

        this.output = output;
    }

    @Override
    public String name() {
        return "=== Create a new Item ===";
    }


    @Override
    public boolean execute(Input input, Store tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
