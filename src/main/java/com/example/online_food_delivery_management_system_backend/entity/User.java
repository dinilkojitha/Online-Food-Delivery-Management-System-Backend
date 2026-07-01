package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userID", nullable = false)
    private Integer id;

    @Size(max = 30)
    @NotNull
    @Column(name = "userName", nullable = false, length = 30)
    private String userName;

    @Size(max = 20)
    @NotNull
    @Column(name = "NIC", nullable = false, length = 20)
    private String nic;

    @Size(max = 15)
    @NotNull
    @Column(name = "phoneNumber", nullable = false, length = 15)
    private String phoneNumber;

    @Size(max = 40)
    @NotNull
    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @Size(max = 200)
    @NotNull
    @Column(name = "password", nullable = false, length = 200)
    private String password;

    @NotNull
    @Column(name = "registeredDate", nullable = false)
    private Instant registeredDate;

    @Size(max = 15)
    @NotNull
    @Column(name = "role", nullable = false, length = 15)
    private String role;

}