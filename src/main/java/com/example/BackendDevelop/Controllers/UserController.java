package com.example.BackendDevelop.Controllers;

import com.example.BackendDevelop.CreateModels.UserCreateModel;
import com.example.BackendDevelop.DTO.UserDTO;
import com.example.BackendDevelop.Entities.User;
import com.example.BackendDevelop.Services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @PostMapping("/api/registration")
    public ResponseEntity registration(){

        iUserService.registerUser();

        return ResponseEntity.ok("ok");
    }

    @GetMapping("/api/registration")
    public ResponseEntity<List<User>> getUsers(){

        return ResponseEntity.ok(iUserService.getUsers());

    }
}
