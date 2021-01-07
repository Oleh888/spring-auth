package com.example.springauth.dao.impl;

import com.example.springauth.dao.Storage;
import com.example.springauth.dao.UserRepository;
import com.example.springauth.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User findUserByUserName(String userName) {
        return Storage.userStorage.stream()
                .filter(user -> user.getUsername().equals(userName))
                .findFirst()
                .get();
    }

    @Override
    public void save(User user) {
        Storage.userStorage.add(user);
    }
}
