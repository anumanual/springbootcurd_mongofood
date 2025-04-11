package com.foodservice.foodservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodservice.foodservice.model.FoodDelivery;
import com.foodservice.foodservice.service.FoodDeliveryService;

@RestController
@RequestMapping("/fooddelivery")
public class FoodDeliveryController {
    
    @Autowired
    private FoodDeliveryService foodDeliveryService;

    @PostMapping
    public FoodDelivery addFoodDelivery(@RequestBody FoodDelivery foodDelivery)
    {
        return foodDeliveryService.saveFoodDelivery(foodDelivery);
    }

    @GetMapping
    public List<FoodDelivery> getFoodDeliveries()
    {
        return foodDeliveryService.getAllFoodDeliveries();
    }


    @GetMapping("/{id}")
    public Optional<FoodDelivery> getFoodDeliveryById(@PathVariable String id)
    {
        return foodDeliveryService.getFoodDeliveryById(id);
    }

    @PutMapping("/{id}")
    public FoodDelivery updatFoodDelivery(@PathVariable String id,@RequestBody FoodDelivery foodDelivery)
    {
        return foodDeliveryService.updateFoodDelivery(id, foodDelivery);
    }

    @DeleteMapping("/{id}")
    public String deleteFoodDelivery(@PathVariable String id)
    {
        return foodDeliveryService.deleteFoodDelivery(id);
    }
    
}
