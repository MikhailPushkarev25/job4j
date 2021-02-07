package ru.job4j.tracker;
/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 */
public class FindByIdItem implements UserAction {

    @Override
    public String name() {
        return "=== Search by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(tracker.findById(id));
        } else {
            System.out.println("Error");
        }
        return false;
    }
}
