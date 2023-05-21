package com.mct.FoodDeliveryPlatform.service;

import com.mct.FoodDeliveryPlatform.Repository.IRestaurantRepo;
import com.mct.FoodDeliveryPlatform.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    @Autowired
    IRestaurantRepo restaurantRepo;
    public String insertRestaurant(List<Restaurant> restaurant) {
        Iterable<Restaurant> statusRestaurant = restaurantRepo.saveAll(restaurant);

        if(statusRestaurant != null){
            return "Restaurant Added Successfully......!!!!!!!!";
        }else{
            return " Failed.....Not Added....!!!!!!!";
        }
    }

    public Iterable<Restaurant> getAllRestaurant() {
        return restaurantRepo.findAll();
    }

    public Optional getRestaurantById(Integer resId) {
        return restaurantRepo.findById(resId);
    }



    public String removeRestaurantById(Integer resId) {
        restaurantRepo.deleteById(resId);
        return "Deleted successfully.......!!!!!!!";
    }
}
