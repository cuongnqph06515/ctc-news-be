package com.spring.news.Service;

import com.spring.news.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserByUsername(String username);
}
