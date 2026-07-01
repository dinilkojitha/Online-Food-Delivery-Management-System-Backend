package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @Column(name = "orderID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerID", nullable = false)
    private User customerID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderedRestaurantID", nullable = false)
    private Restaurant orderedRestaurantID;

    @NotNull
    @Column(name = "orderDate", nullable = false)
    private LocalDate orderDate;

    @NotNull
    @Column(name = "orderTime", nullable = false)
    private LocalTime orderTime;

    @Size(max = 150)
    @NotNull
    @Column(name = "deliveryAddress", nullable = false, length = 150)
    private String deliveryAddress;

    @Size(max = 45)
    @NotNull
    @Column(name = "status", nullable = false, length = 45)
    private String status;

    @NotNull
    @Column(name = "totalAmount", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

}