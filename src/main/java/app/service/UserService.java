package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(int id);
    User getById(int id);
    List<User> getAllUsers();
}
