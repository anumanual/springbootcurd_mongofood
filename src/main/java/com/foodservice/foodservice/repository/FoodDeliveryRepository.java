package com.foodservice.foodservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodservice.foodservice.model.FoodDelivery;

@Repository
public interface FoodDeliveryRepository extends MongoRepository<FoodDelivery,String>{
    
}
