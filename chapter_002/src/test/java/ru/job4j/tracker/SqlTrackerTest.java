package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SqlTrackerTest {

    public Connection init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item(1, "name"));
            assertThat(tracker.findByName("name").size(), is(1));
        }

    }

    @Test
    public void replace() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
           Item item = new Item("name");
            Item items = new Item("names");
            tracker.add(item);
            tracker.replace(item.getId(), items);
            assertThat(tracker.findByName("names").size(), is(1));

        }
    }

    @Test
    public void delete() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("item");
            tracker.add(item);
            tracker.delete(item.getId());
            assertNull(tracker.findById(item.getId()));
        }
    }

    @Test
    public void findAll() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
          Item item = new Item("name");
          Item item1 = new Item("names");
          tracker.add(item);
          tracker.add(item1);
           assertThat(tracker.findAll().size(), is(8));
        }
    }

    @Test
    public void findByName() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("name");
            tracker.add(item);
            List<Item> list = tracker.findByName(item.getName());
            assertThat(list.get(0).getName(), is("name"));
        }
    }

    @Test
    public void findById() throws SQLException {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("name");
            tracker.add(item);
            int id = item.getId();
            assertThat(tracker.findById(id).getName(), is(item.getName()));
        }
    }
}