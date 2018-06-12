package com.querydsl.service;

import com.querydsl.model.User;
import com.querydsl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();
    }
}
