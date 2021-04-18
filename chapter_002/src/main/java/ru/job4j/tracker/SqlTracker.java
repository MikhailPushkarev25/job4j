package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {
    private Connection cn;

    @Override
    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public Item add(Item item) {
        Item rsl = null;
        String query = String.format("insert into items(name) values('%s');", item.getName());
        if (executeQuery(query)) {
            rsl = item;
        }
        return rsl;
    }

    @Override
    public boolean replace(int id, Item item) {
        String query = String.format("update items set name='%s' where id='%s';", item.getName(), id);
        return executeQuery(query);
    }

    @Override
    public boolean delete(int id) {
        String query = String.format("delete items id='%s';", id);
        return executeQuery(query);
    }

    @Override
    public List<Item> findAll() {
        List<Item> itemList = new ArrayList<>();
        String query = "select * from items;";
        ResultSet rs = resSet(query);
        try {
            while (rs.next()) {
                itemList.add(new Item(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> itemList = new ArrayList<>();
        String query = String.format("select * from items where name='%s';", key);
        ResultSet rs = resSet(query);
        try {
            while (rs.next()) {
                itemList.add(new Item(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    @Override
    public Item findById(int id) {
        Item item = null;
        String query = String.format("select * format items where id='%s';", id);
        ResultSet rs = resSet(query);
        try {
            rs.next();
            item = new Item(rs.getInt("id"), rs.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    private boolean executeQuery(String query) {
        boolean rs = false;
        try (Statement st = cn.createStatement()) {
            st.execute(query);
            if (st.getUpdateCount() > 0) {
                rs = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    private ResultSet resSet(String query) {
        ResultSet rs = null;

        try (Statement st = cn.createStatement()) {
            st.execute(query);
            rs = st.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void createTable(String query) {
        executeQuery(String.format("create table %s(id serial primary key, name text);", query));
    }
}
