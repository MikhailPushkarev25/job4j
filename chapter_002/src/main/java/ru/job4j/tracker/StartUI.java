package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
 * Так же осуществил рефакторинг проекта.
 * Убрал массивы и добавил интерфейс List для гибкости кода.
 */
public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public  void init(Input input, Store tracker, List<UserAction> actions) throws SQLException {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 ..." + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

        private void showMenu(List<UserAction> actions) {
            out.println("Menu.");
            for (int index = 0; index < actions.size(); index++) {
                System.out.println(index + ". " + actions.get(index).name());
            }
        }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        try (Store tracker = new SqlTracker()) {
            tracker.init();
            List<UserAction> actions = new ArrayList<>();
            actions.add(new CreateAction(output));
            actions.add(new FindAll(output));
            actions.add(new Exit(output));
            actions.add(new DeleteItem(output));
            actions.add(new FindByNameItem(output));
            actions.add(new FindByIdItem(output));
            actions.add(new ReplaceItem(output));

            new StartUI(output).init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

