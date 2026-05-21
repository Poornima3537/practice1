package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDTO;
import com.example.demo.dto.RegisterDTO;
import com.example.demo.entity.User;
import com.example.demo.service.AuthService;

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