package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.TokenDTO;


public interface IUserService {
    TokenDTO createNewUser(UserCreateModel userCreateModel);
}
