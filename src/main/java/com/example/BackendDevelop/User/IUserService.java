package com.example.BackendDevelop.User;

import java.util.List;


public interface IUserService {
    List<User> getUsers();
    void registerUser(User user);
}
