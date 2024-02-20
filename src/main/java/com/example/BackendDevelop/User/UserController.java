package com.example.BackendDevelop.User;

import com.example.BackendDevelop.AppException.AppException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity registration(@RequestBody User user){

        try{

            iUserService.registerUser(user);

            return new ResponseEntity<>(HttpStatus.OK);

        } catch (AppException e){

            return ResponseEntity.status(e.getStatus()).body(e);
            //return new ResponseEntity<>(e.getMessage(),HttpStatusCode.valueOf(e.getStatus()));

        }

    }

    @PostMapping("/api/login")
    public ResponseEntity login(@RequestBody UserDTO userDTO){

        try{

            return ResponseEntity.status(200).body(userDTO);

        } catch (AppException e){

            return ResponseEntity.status(e.getStatus()).body(e);

        }

    }

    @GetMapping("/api/registration")
    public ResponseEntity<List<User>> getUsers(){

        return ResponseEntity.ok(iUserService.getUsers());

    }
}
