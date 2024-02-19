package com.example.BackendDevelop;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;
    // сюда добавить полный RequestMapping(
// value = ...
// )
    @PostMapping("/api/registration")
    public ResponseEntity<TokenDTO> registration(@RequestBody UserCreateModel userCreateModel){
        return ResponseEntity.ok(iUserService.createNewUser(userCreateModel));
    }
}
