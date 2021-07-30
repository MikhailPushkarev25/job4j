package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByIdNameTest {

    @Test
    public void findByNameAction() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item = new Item("Item");
        tracker.add(item);
        FindByNameItem nameItem = new FindByNameItem(out);

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(1);

        nameItem.execute(input, tracker);

        assertThat(tracker.findByName("Item").get(0), is(item));
    }
}
