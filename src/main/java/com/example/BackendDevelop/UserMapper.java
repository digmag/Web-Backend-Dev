package com.example.BackendDevelop;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(UserCreateModel userCreateModel);
}
