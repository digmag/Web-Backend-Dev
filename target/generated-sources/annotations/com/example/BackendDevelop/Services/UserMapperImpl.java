package com.example.BackendDevelop.Services;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(UserCreateModel userCreateModel) {
        if ( userCreateModel == null ) {
            return null;
        }

        UserCreateModel userCreateModel1 = null;

        userCreateModel1 = userCreateModel;

        UserDTO userDTO = new UserDTO( userCreateModel1 );

        return userDTO;
    }
}
