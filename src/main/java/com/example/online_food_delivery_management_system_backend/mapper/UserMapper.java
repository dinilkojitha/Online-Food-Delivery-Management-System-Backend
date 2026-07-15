package com.example.online_food_delivery_management_system_backend.mapper;

import com.example.online_food_delivery_management_system_backend.dto.request.UserRequest;
import com.example.online_food_delivery_management_system_backend.dto.response.UserResponse;
import com.example.online_food_delivery_management_system_backend.entity.User;

public class UserMapper {

    public User toEntity(UserRequest userRequest){
        User user = new User();

        user.setUserName(userRequest.getUserName());
        user.setNic(userRequest.getNic());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        user.setRegisteredDate(userRequest.getRegisteredDate());

        return user;
    }

    public UserResponse toResponse(User user){
        UserResponse userResponse = new UserResponse();

        userResponse.setId(user.getId());
        userResponse.setUserName(user.getUserName());
        userResponse.setNic(user.getNic());
        userResponse.setPhoneNumber(user.getPhoneNumber());
        userResponse.setEmail(user.getEmail());
        userResponse.setRole(user.getRole());
        userResponse.setRegisteredDate(user.getRegisteredDate());

        return userResponse;
    }
}
