package com.example.online_food_delivery_management_system_backend.repository;

import com.example.online_food_delivery_management_system_backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order,Integer> {
}
