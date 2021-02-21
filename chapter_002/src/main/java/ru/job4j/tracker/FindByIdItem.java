package ru.job4j.tracker;
/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class FindByIdItem implements UserAction {

    private final Output out;

    public FindByIdItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Search by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(tracker.findById(id));
        } else {
            out.println("Error");
        }
        return false;
    }
}
