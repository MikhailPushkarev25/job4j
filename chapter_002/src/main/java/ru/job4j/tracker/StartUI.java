package ru.job4j.tracker;

/**
 * @author Mikhail Pushkarev
 * @since 08.02.2021
 * @version 2.2
 * В классе произвел страстегию
 * разбросал методы по классам для полследующего рефакторинга без
 * задействия класса StartUI
 * В этом проекте я осуществил разрыв от системы вывода,
 * создал интерфейс и классы, далее в каждом классе добавил конструктор и создал обьект
 * интерфейса.
 */
public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public  void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 ..." + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

        private void showMenu(UserAction[] actions) {
            out.println("Menu.");
            for (int index = 0; index < actions.length; index++) {
                System.out.println(index + ". " + actions[index].name());
            }
        }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(output),
                new FindAll(output),
                new ReplaceItem(output),
                new DeleteItem(output),
                new FindByIdItem(output),
                new FindByNameItem(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, action);
    }
}
