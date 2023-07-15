package com.sachin.Restaurant.management.system.repository;

import com.sachin.Restaurant.management.system.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem, Long> {
}
