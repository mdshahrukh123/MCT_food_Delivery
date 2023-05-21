package com.mct.FoodDeliveryPlatform.controller;

import com.mct.FoodDeliveryPlatform.model.Restaurant;
import com.mct.FoodDeliveryPlatform.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value  = "/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping
    public String addRestaurant(@RequestBody List<Restaurant> restaurant){
        return restaurantService.insertRestaurant(restaurant);
    }

    @GetMapping(value = "/restaurant/show")
    public Iterable<Restaurant> showAllRestaurant(){
        return  restaurantService.getAllRestaurant();
    }

    @GetMapping(value = "/restaurant/id/{resId}")
    public Optional getRestaurantById(@PathVariable Integer resId){
        return restaurantService.getRestaurantById(resId);
    }


    @DeleteMapping(value = "/restaurant/remove/id/{resId}")
    public String removeRestaurantById(@PathVariable Integer resId){
        return restaurantService.removeRestaurantById(resId);
    }

}
