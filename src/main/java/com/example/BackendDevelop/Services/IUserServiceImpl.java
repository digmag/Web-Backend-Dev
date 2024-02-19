package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.TokenDTO;
import com.example.BackendDevelop.DTO.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Override
    public TokenDTO createNewUser(UserCreateModel userCreateModel) {
        UserDTO userDTO = UserMapper.INSTANCE.toDTO(userCreateModel);
        return userDTO.returnToken();
    }
}
