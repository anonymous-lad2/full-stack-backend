package com.codewithme.fullstack_backend.controller;

import com.codewithme.fullstack_backend.exception.UserNotFoundException;
import com.codewithme.fullstack_backend.model.User;
import com.codewithme.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User addUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable int id){
        return userRepository.findById(id).
                orElseThrow(() -> new UserNotFoundException(id));
    }

}
