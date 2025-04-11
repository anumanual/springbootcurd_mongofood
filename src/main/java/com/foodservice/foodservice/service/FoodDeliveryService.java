package com.foodservice.foodservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodservice.foodservice.model.FoodDelivery;
import com.foodservice.foodservice.repository.FoodDeliveryRepository;

@Service
public class FoodDeliveryService {

    @Autowired
    private FoodDeliveryRepository foodDeliveryRepository;

    public FoodDelivery saveFoodDelivery(FoodDelivery foodDelivery)
    {
        return foodDeliveryRepository.save(foodDelivery);
    }

    public List<FoodDelivery> getAllFoodDeliveries()
    {
        return foodDeliveryRepository.findAll();
    }

    public Optional<FoodDelivery> getFoodDeliveryById(String id)
    {
        return foodDeliveryRepository.findById(id);
    }
    
    public FoodDelivery updateFoodDelivery(String id,FoodDelivery updatedFoodDelivery)
    {
        if(foodDeliveryRepository.existsById(id))
        {
            updatedFoodDelivery.setId(id);
            return foodDeliveryRepository.save(updatedFoodDelivery);
        }
        return null;
    }

    public String deleteFoodDelivery(String id)
    {
        foodDeliveryRepository.deleteById(id);
        return "Food Delivery with ID: "+id+" deleted";
    }
   
}
