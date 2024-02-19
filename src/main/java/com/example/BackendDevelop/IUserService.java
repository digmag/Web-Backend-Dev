package com.example.BackendDevelop;


public interface IUserService {
    TokenDTO createNewUser(UserCreateModel userCreateModel);
}
