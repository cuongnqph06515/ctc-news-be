package com.spring.news.Dao;

import com.spring.news.Entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserByUsername(String username);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
