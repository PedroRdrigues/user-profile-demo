package com.userprofile.user_profile_demo.controller;

import com.userprofile.user_profile_demo.domain.User;
import com.userprofile.user_profile_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private UserService userService;

    // Recebe os dados dos usuários e salva no bando de dados
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
