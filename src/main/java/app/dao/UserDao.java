package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void edit(User user);
    void delete(User user);
    User getById(int id);
    List<User> getAllUsers();
}
