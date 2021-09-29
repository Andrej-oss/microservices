package com.example.usermicroservice.service;

import com.example.usermicroservice.entity.User;
import com.example.usermicroservice.valueObject.UserResponseDto;

import java.util.List;

public interface UserService {

    User getUser(long id);
    List<User> getAllUsers();
    User saveUser(User user);
    boolean upDateUser(long id, User user);
    boolean deleteUser(long id);

    UserResponseDto getUserWithDepartment(Long id);
}
