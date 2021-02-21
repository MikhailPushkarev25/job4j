package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class ReplaceItem implements UserAction {

    private final Output out;

    public ReplaceItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Replace item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = new Item(input.askStr("Enter name: "));
        if (tracker.replace(id, item)) {
            System.out.println("Good. Edit end");
        } else {
            System.out.println("Error. Edit end");
        }
        return true;
    }
}
