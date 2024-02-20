package com.example.BackendDevelop.User;


import com.example.BackendDevelop.AppException.AppException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
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
    public void registerUser(User user){

        if(userRepository.findUsersByLogin(
                user.getLogin())
                .isPresent())
        {
            throw new AppException(400, "Login already taken");
        }

        userRepository.save(user);
    }
}
