package com.example.online_food_delivery_management_system_backend.service;

import com.example.online_food_delivery_management_system_backend.dto.response.UserResponse;
import com.example.online_food_delivery_management_system_backend.entity.User;
import com.example.online_food_delivery_management_system_backend.mapper.UserMapper;
import com.example.online_food_delivery_management_system_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<String> userDelete(Integer id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return ResponseEntity.ok("Account delete successful.");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Account not found.");
        }
    }

    public List<UserResponse> getAll(){
        List<User> users =  userRepository.findAll();
        List<UserResponse> userResponseList = new ArrayList<>();
        UserMapper userMapper = new UserMapper();

        users.forEach(user -> {
            userResponseList.add(userMapper.toResponse(user));
        });
        return userResponseList;
    }


}
