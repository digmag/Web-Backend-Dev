package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.UserDTO;
import com.example.BackendDevelop.Entities.User;
import com.example.BackendDevelop.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @SneakyThrows
    @Override
    public void registerUser(){

        var user = new User("te11st","testlogin11","testpas1swor1d");

        if(userRepository.findUsersByLogin(
                user.getLogin())
                .isPresent()){
            throw new IllegalAccessException("login taken");
        }

        userRepository.save(user);
    }
}
