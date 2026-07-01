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
@Table(name = "offer")
public class Offer {
    @Id
    @Column(name = "offerID", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "offerType", nullable = false, length = 45)
    private String offerType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resaurentID", nullable = false)
    private Restaurant resaurentID;

    @NotNull
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Size(max = 255)
    @Column(name = "discription")
    private String discription;

    @Size(max = 200)
    @Column(name = "title", length = 200)
    private String title;

}