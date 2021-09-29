package com.example.usermicroservice.service.serviceImpl;

import com.example.usermicroservice.entity.User;
import com.example.usermicroservice.repository.UserDao;
import com.example.usermicroservice.service.UserService;
import com.example.usermicroservice.valueObject.Department;
import com.example.usermicroservice.valueObject.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    private RestTemplate restTemplate;

    @Autowired
    public UserServiceImpl(UserDao userDao, RestTemplate restTemplate) {
        this.userDao = userDao;
        this.restTemplate = restTemplate;
    }

    @Override
    public User getUser(long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public boolean upDateUser(long id, User user) {
        return false;
    }

    @Override
    public boolean deleteUser(long id) {
        return false;
    }

    @Override
    public UserResponseDto getUserWithDepartment(Long id) {
        final User user = userDao.findById(id).get();
        final UserResponseDto userResponseDto = new UserResponseDto();
        final Department department = restTemplate
                .getForObject("http://department-service/department/" + user.getDepartmentId(), Department.class);
        userResponseDto.setUser(user);
        userResponseDto.setDepartment(department);
        return userResponseDto;
    }
}
