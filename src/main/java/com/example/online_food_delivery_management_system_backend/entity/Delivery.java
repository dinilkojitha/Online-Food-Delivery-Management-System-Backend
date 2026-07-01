package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @Column(name = "deliveryID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderID", nullable = false)
    private Order orderID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "driverID", nullable = false)
    private User driverID;

    @Size(max = 45)
    @Column(name = "status", length = 45)
    private String status;

    @Column(name = "deliveryTime")
    private Instant deliveryTime;

}