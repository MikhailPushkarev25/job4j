package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {


    @Test
    public void whenAddItem() {
        Output output = new ConsoleOutput();
        String[] answers = {"Fix Pc"};
        Input input = new StubInput(answers);
        MemTracker tracker = new MemTracker();
        new CreateAction(output).execute(input, tracker);
        Item  created = tracker.findAll().get(0);
        Item expected = new Item("Fix Pc");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new ConsoleOutput();
        MemTracker tracker = new MemTracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "replaced item"
        };
        new ReplaceItem(output).execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new ConsoleOutput();
        MemTracker tracker = new MemTracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        new DeleteItem(output).execute(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        MemTracker tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
               actions.add(new CreateAction(output));
               actions.add(new Exit(output));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplacedItem() {
        Output output = new ConsoleOutput();
        MemTracker tracker = new MemTracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        String str = String.valueOf(Integer.valueOf(item.getId()));
        Input in = new StubInput(
                new String[] {"0", str, replacedName,  "1"}
        );
        List<UserAction> actions = new ArrayList<>();
               actions.add(new ReplaceItem(output));
                actions.add(new Exit(output));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeletedItem() {
        Output output = new ConsoleOutput();
        MemTracker tracker = new MemTracker();
        Item item = tracker.add(new Item("Deleted item"));
        String str = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0", str, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
                actions.add(new DeleteItem(output));
                actions.add(new Exit(output));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        MemTracker tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
               actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void findAllAction() {
       MemTracker tracker = new MemTracker();
       Item item = new Item("New item");
       tracker.add(item);
       assertThat(tracker.findAll().get(0).getName(), is("New item"));
    }

    @Test
    public void findByNameAction() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("Name item");
        tracker.add(item);
        List<Item> result = tracker.findByName(item.getName());
        assertThat(result.get(0).getName(), is(item.getName()));
    }

    @Test
    public void findByAction() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("Name item");
        tracker.add(item);
        int id = item.getId();
        assertThat(tracker.findById(id).getName(), is(item.getName()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"9", "0"}
        );
        MemTracker tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
                actions.add(new Exit(out));

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(

                String.format(
                                  "Menu.%n"
                                + "Wrong input, you can select: 0 ...0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));

    }

    @Test (expected = NumberFormatException.class)
    public void whenInvalidExitLine() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"name", "0"}
        );
        MemTracker tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
                actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
    }
}