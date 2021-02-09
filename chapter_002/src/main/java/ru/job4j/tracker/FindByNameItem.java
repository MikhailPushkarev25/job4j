package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class FindByNameItem implements UserAction {

    private final Output out;

    public FindByNameItem(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return "=== Search by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                out.println("Successful");
            }
        } else {
                out.println("Not found name");
        }
        return true;
    }
}