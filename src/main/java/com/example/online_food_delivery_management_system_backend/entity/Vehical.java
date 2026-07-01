package com.example.online_food_delivery_management_system_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehical")
public class Vehical {
    @Id
    @Column(name = "vehicalID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "vehicalType", nullable = false)
    private Integer vehicalType;

    @Size(max = 7)
    @NotNull
    @Column(name = "vehicalNumber", nullable = false, length = 7)
    private String vehicalNumber;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userID", nullable = false)
    private User userID;

}