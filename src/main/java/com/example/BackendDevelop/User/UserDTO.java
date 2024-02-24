package com.example.BackendDevelop.User;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.control.MappingControl;
@Builder
@Getter
@Setter
public class UserDTO {
    private String fullName;
    private String login;
    private String password;
    public UserDTO(User user){
        this.fullName = user.getFullName();
        this.login = user.getLogin();
        this.password = user.getPassword();
    }

    public UserDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
