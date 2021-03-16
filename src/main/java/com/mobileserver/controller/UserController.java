package com.mobileserver.controller;

import com.mobileserver.repository.User;
import com.mobileserver.repository.UserCreateRequest;
import com.mobileserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserCreateRequest req) {
        return userService.createUser(req);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody UserCreateRequest req) {
        return userService.createUser(req);
    }
}
