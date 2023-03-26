package com.example.notesservice.controller;

import com.example.notesservice.domain.User;
import com.example.notesservice.repo.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
@Api(tags = "users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/signup")
    public ResponseEntity<User> signUpUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
}
