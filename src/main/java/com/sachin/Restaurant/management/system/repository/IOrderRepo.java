package com.sachin.Restaurant.management.system.repository;

import com.sachin.Restaurant.management.system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order, Long> {
}
