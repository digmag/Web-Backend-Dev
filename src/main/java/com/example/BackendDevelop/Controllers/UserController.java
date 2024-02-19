package com.example.BackendDevelop.Controllers;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.TokenDTO;
import com.example.BackendDevelop.Services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
// сюда добавить полный RequestMapping(
// value = ...
// )
public class UserController {
    private final IUserService iUserService;
    @PostMapping("/api/registration")
    public ResponseEntity<TokenDTO> registration(@RequestBody UserCreateModel userCreateModel){
        return ResponseEntity.ok(iUserService.createNewUser(userCreateModel));
    }
}
