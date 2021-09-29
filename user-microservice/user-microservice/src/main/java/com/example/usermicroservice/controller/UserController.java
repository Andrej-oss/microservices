package com.example.usermicroservice.controller;

import com.example.usermicroservice.entity.User;
import com.example.usermicroservice.service.UserService;
import com.example.usermicroservice.valueObject.UserResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User saveUser(@RequestBody User user){
      log.info("Handling post  with body " + user);
      return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        log.info("Handling getting user by id = " + id);
        return userService.getUser(id);
    }
    @GetMapping("/department/{id}")
    public UserResponseDto getUserWithDepartment(@PathVariable Long id){
        log.info("Handling getting userDepartmentDto by id = " + id);
        return userService.getUserWithDepartment(id);
    }
}
