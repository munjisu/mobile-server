package com.mobileserver.service;

import com.mobileserver.repository.User;
import com.mobileserver.repository.UserCreateRequest;
import com.mobileserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id) {
        return Optional.ofNullable(userRepository.findById(id)).get().orElse(new User());
    }

    public User createUser(UserCreateRequest req) {
        User createUser = new User(req.getUserId(), req.getUserPwd());
        return userRepository.save(createUser);
    }
}
