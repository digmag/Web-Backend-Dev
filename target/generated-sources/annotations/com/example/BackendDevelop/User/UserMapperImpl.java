package com.example.BackendDevelop.User;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        User user1 = null;

        user1 = user;

        UserDTO userDTO = new UserDTO( user1 );

        return userDTO;
    }
}
