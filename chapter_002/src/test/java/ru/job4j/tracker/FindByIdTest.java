package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByIdTest {

    @Test
    public void findByAction() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item = new Item("Item");
        tracker.add(item);
        int id = item.getId();
        FindByIdItem idItem = new FindByIdItem(out);

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(id);

        idItem.execute(input, tracker);

        assertThat(tracker.findById(id).getName(), is(item.getName()));

    }
}
