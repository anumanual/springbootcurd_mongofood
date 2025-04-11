package com.foodservice.foodservice.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="foods")
public class FoodDelivery {
    
    @Id
    private String id;
    private String customerName;
    private String foodItem;
    private int quantity;
    private double price;
    private String address;
    private LocalDateTime orderDate=LocalDateTime.now();
}
