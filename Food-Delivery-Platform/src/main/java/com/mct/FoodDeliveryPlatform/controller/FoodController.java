package com.mct.FoodDeliveryPlatform.controller;

import com.mct.FoodDeliveryPlatform.model.Food;
import com.mct.FoodDeliveryPlatform.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping
    public String AddFood(@RequestBody List<Food> food){
        return foodService.AddFood(food);
    }

    @GetMapping(value = "/food/show")
    public Iterable<Food> showAllFood(){
        return foodService.showAllTypeFood();
    }

    @GetMapping(value = "/food/name/{id}")
    public Food getFoodById(@PathVariable Integer id){
        return foodService.getFoodThroughId(id);
    }

    @DeleteMapping(value = "/food/{id}")
    public String removeFood(@PathVariable Integer id){
        return foodService.removeFoodById(id);
    }


}
