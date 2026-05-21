package com.example.demo.controller;


import com.hotelbooking.dto.LoginDTO;
import com.hotelbooking.dto.RegisterDTO;
import com.hotelbooking.entity.User;
import com.hotelbooking.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Register API
    @PostMapping("/register")
    public User register(@RequestBody RegisterDTO dto) {

        return authService.register(dto);
    }

    // Login API
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO dto) {

        return authService.login(dto);
    }
}