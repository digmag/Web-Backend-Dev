package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserDTO toDTO(UserCreateModel userCreateModel);
}
