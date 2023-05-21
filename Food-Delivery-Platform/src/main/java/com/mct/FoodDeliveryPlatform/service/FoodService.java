package com.mct.FoodDeliveryPlatform.service;

import com.mct.FoodDeliveryPlatform.Repository.IFoodRepo;
import com.mct.FoodDeliveryPlatform.model.Food;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodService {
    @Autowired
    IFoodRepo foodRepo;
    public String AddFood(List<Food> food) {
        Iterable<Food> statusFood = foodRepo.saveAll(food);

        if(statusFood != null){
            return "Food added Successfully......!!!!!!";
        }
        else{
            return "Not Added...!!!!!!";
        }
    }

    public Iterable<Food> showAllTypeFood() {
        return foodRepo.findAll();
    }
    @Transactional
    public Food getFoodThroughId(Integer id) {
        return foodRepo.findFoodById(id);
    }

    public String removeFoodById(Integer id) {
        foodRepo.deleteById(id);
         return "Deleted Food Successfully ....!!!!";
    }


}
