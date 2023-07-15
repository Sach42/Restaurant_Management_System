package com.sachin.Restaurant.management.system.service;

import com.sachin.Restaurant.management.system.exception.NotFoundException;
import com.sachin.Restaurant.management.system.model.FoodItem;
import com.sachin.Restaurant.management.system.repository.IFoodItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    private final IFoodItemRepo foodItemRepo;

    public FoodItemService(IFoodItemRepo foodItemRepository) {
        this.foodItemRepo = foodItemRepository;
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
        return foodItemRepo.save(foodItem);
    }

    public FoodItem getFoodItemById(Long id) {
        return foodItemRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("FoodItem not found"));
    }

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepo.findAll();
    }

    public void deleteFoodItem(Long id) {
        foodItemRepo.deleteById(id);
    }
}

