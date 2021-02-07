package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В данном  классе я создал статические методы на каждое меню,
 * так как более читабельнее код получается. Рефакторинг
 */
public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static Item[] showItem(Tracker tracker) {
        System.out.println("=== Print an element ===");
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
        return item;
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Successful " + id);
        } else {
            System.out.println("Error " + id);
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Successful " + id);
        } else {
            System.out.println("Error " + id);
        }
    }

    public static void findItem(Input input, Tracker tracker) {
        System.out.println("=== Search by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(tracker.findById(id));
        } else {
            System.out.println("Error");
        }
    }

    public static void findItemName(Input input, Tracker tracker) {
        System.out.println("=== Search by name ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                System.out.println("Successful");
            }
        } else {
            System.out.println("Not found name");
        }
    }


    public  void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItem(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItem(input, tracker);
            } else if (select == 5) {
                StartUI.findItemName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

        private void showMenu () {
            System.out.println("Menu.");
            System.out.println("0. Add new Item");
            System.out.println("1. Show all items");
            System.out.println("2. Edit item");
            System.out.println("3. Delete item");
            System.out.println("4. Find item by id");
            System.out.println("5. Find items by name");
            System.out.println("6. Exit Program");
        }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
