package com.example.BackendDevelop;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-19T11:47:42+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)"
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
