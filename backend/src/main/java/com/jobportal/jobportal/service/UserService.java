package com.jobportal.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.User;
import com.jobportal.jobportal.repository.UserRepository;
import com.jobportal.jobportal.security.JwtUtil;
import com.jobportal.jobportal.dto.LoginResponse;
@Service
public class UserService {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserRepository repository;

    private BCryptPasswordEncoder encoder =
            new BCryptPasswordEncoder();

    // REGISTER
    public User register(User user) {

        user.setPassword(
                encoder.encode(user.getPassword())
        );

        return repository.save(user);
    }

    // LOGIN
    public LoginResponse login(
            String email,
            String password) {

        User user = repository
                .findByEmail(email)
                .orElse(null);

        if (user != null &&
                encoder.matches(
                        password,
                        user.getPassword())) {

            String token =
                    jwtUtil.generateToken(email);

            return new LoginResponse(
                    token,
                    user.getRole()
            );
        }

        return null;
    }
}