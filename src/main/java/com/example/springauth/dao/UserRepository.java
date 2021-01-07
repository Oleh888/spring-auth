package com.example.springauth.dao;

import com.example.springauth.model.User;

public interface UserRepository {
    User findUserByUserName(String userName);
    void save(User user);
}
