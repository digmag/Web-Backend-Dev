package com.example.BackendDevelop.DTO;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.control.MappingControl;
@Getter
@Setter
public class UserDTO {
    private String fullName;
    private String login;
    private String password;
    public UserDTO(UserCreateModel userCreateModel){
        this.fullName = userCreateModel.fullName;
        this.login = userCreateModel.login;
        this.password = userCreateModel.password;
    }
    public TokenDTO returnToken(){
        return new TokenDTO();
    }
}
