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
    public Item add(Item item) throws SQLException {
        String query = "insert into items(name) values(?)";
        try (PreparedStatement statement = cn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            statement.execute();
            try (ResultSet keys = statement.getGeneratedKeys()) {
                if (keys.next()) {
                    item.setId(keys.getInt(1));
                }
            }
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) throws SQLException {
        boolean result;
        String query = "update items set name=? where id=?";
        try (PreparedStatement statement = cn.prepareStatement(query)) {
            statement.setString(1, item.getName());
            statement.setInt(2, id);
            result = statement.executeUpdate() > 0;
        }
        return result;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean result;
        String query = "delete from items where id=?";
       try (PreparedStatement statement = cn.prepareStatement(query)) {
           statement.setInt(1, id);
           result = statement.executeUpdate() > 0;
       }
       return result;
    }

    @Override
    public List<Item> findAll() throws SQLException {
        List<Item> itemList = new ArrayList<>();
        String query = "select * from items";
       try (PreparedStatement statement = cn.prepareStatement(query)) {
           try (ResultSet rs = statement.executeQuery()) {
               while (rs.next()) {
                   itemList.add(new Item(
                           rs.getInt("id"),
                           rs.getString("name")
                   ));
               }
           }
       }
       return itemList;
    }

    @Override
    public List<Item> findByName(String name) throws SQLException {
        List<Item> itemList = new ArrayList<>();
        String query = "select * from items where name=?";
        try (PreparedStatement statement = cn.prepareStatement(query)) {
            statement.setString(1, name);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    itemList.add(new Item(
                            rs.getInt("id"),
                            rs.getString("name")
                    ));
                }
            }
        }
        return itemList;
    }

    @Override
    public Item findById(int id) throws SQLException {
        List<Item> itemList = new ArrayList<>();
        String query = "select * from items where id=?";
        try (PreparedStatement statement = cn.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    itemList.add(new Item(
                            rs.getInt("id"),
                            rs.getString("name")
                    ));
                }
            }
        }
        return itemList.size() > 0 ? itemList.get(0) : null;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }
}
