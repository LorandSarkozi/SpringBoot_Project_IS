package com.example.is_project2.service;

import com.example.is_project2.dto.UserDto;
import com.example.is_project2.model.RegistrationRequest;
import com.example.is_project2.model.User;

import java.util.List;

public interface UserService {

    boolean checkEmail(String email);

    UserDto registerUser(RegistrationRequest registrationRequest);

    UserDto getLoginUser();

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    UserDto createUser(User user);

    UserDto updateUser(User user);

    void deleteUser(User user);
}