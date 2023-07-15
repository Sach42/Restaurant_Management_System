package com.sachin.Restaurant.management.system.controller;

import com.sachin.Restaurant.management.system.model.FoodItem;
import com.sachin.Restaurant.management.system.service.FoodItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {
    private final FoodItemService foodItemService;

    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping
    public FoodItem createFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemService.createFoodItem(foodItem);
    }

    @GetMapping("/{id}")
    public FoodItem getFoodItemById(@PathVariable Long id) {
        return foodItemService.getFoodItemById(id);
    }

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    @DeleteMapping("/{id}")
    public void deleteFoodItem(@PathVariable Long id) {
        foodItemService.deleteFoodItem(id);
    }
}

