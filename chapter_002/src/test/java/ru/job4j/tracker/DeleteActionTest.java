package ru.job4j.tracker;

import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeleteActionTest {

    @Test
    public void whenDeleteItem() throws SQLException {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item = new Item("new Item");
        tracker.add(item);
        DeleteItem deleteItem = new DeleteItem(out);
        int id = item.getId();

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(id);

        deleteItem.execute(input, tracker);

        assertNull(tracker.findById(item.getId()));
    }
}
