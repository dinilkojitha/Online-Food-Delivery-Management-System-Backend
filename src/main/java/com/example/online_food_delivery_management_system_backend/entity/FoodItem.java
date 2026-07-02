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
@Table(name = "foodItems")
public class FoodItem {
    @Id
    @Column(name = "menuID", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "menuName", nullable = false, length = 45)
    private String menuName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurantID", nullable = false)
    private Restaurant restaurantID;

    @Size(max = 255)
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

}