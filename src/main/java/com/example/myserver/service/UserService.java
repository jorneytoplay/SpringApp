package com.example.myserver.service;

import com.example.myserver.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
