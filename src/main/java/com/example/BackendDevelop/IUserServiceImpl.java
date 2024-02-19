package com.example.BackendDevelop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IUserServiceImpl implements IUserService {
    private final UserMapper userMapper;
    @Override
    public TokenDTO createNewUser(UserCreateModel userCreateModel) {
        UserDTO userDTO = userMapper.toDTO(userCreateModel);
        return userDTO.returnToken();
    }
}
