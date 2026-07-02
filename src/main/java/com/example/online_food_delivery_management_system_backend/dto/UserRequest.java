package com.example.online_food_delivery_management_system_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter

public class UserRequest {
    private Integer id;
    private String userName;
    private String nic;
    private String phoneNumber;
    private String email;
    private String password;
    private Instant registeredDate;
    private String role;
}


