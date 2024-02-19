package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.UserDTO;
import com.example.BackendDevelop.Entities.User;

import java.util.List;


public interface IUserService {
    List<User> getUsers();
    void registerUser(User user);
}
