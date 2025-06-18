package com.redis.service;

import com.redis.model.User;
import com.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User user) {
        repository.save(user);
    }

}
