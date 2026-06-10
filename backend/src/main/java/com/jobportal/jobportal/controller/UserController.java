package com.jobportal.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jobportal.jobportal.entity.User;
import com.jobportal.jobportal.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService service;

    // REGISTER API
    @PostMapping("/register")
    public User register(
            @Valid @RequestBody User user) {

        return service.register(user);
    }

    // LOGIN API
    @PostMapping("/login")
    public Object login(
            @RequestBody User user) {

        Object response =
                service.login(
                        user.getEmail(),
                        user.getPassword()
                );

        if (response == null) {
            return "Invalid Email or Password";
        }

        return response;
    }
}