package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ownerID", nullable = false)
    private User ownerID;

    @Size(max = 150)
    @NotNull
    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @NotNull
    @Column(name = "rating", nullable = false, precision = 2, scale = 1)
    private BigDecimal rating;

}