package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "vehicleID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "vehicleType", nullable = false)
    private Integer vehicleType;

    @Size(max = 7)
    @NotNull
    @Column(name = "vehicleNumber", nullable = false, length = 7)
    private String vehicleNumber;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userID", nullable = false)
    private User userID;

}