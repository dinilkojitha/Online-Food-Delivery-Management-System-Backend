package com.example.online_food_delivery_management_system_backend.controller;

import com.example.online_food_delivery_management_system_backend.dto.response.UserResponse;
import com.example.online_food_delivery_management_system_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> userDelete(@PathVariable Integer id){
        return userService.userDelete(id);
    }

    @GetMapping(value = "/allUsers")
    public List<UserResponse> getAll(){
        return userService.getAll();
    }

}
