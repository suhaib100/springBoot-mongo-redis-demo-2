package com.example.springBootmongoredisdemo.controller;
import com.example.springBootmongoredisdemo.model.User;
import com.example.springBootmongoredisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@EnableCaching
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/{id}")
//    @Cacheable(key = "#id", value = "user")
    public User getUserById(@PathVariable Integer    id) {
        System.out.println("called from db");
        return userService.findById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.update(id, user);
    }
}
