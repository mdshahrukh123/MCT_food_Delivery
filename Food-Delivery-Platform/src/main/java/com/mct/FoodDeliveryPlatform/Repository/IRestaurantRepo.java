package com.mct.FoodDeliveryPlatform.Repository;

import com.mct.FoodDeliveryPlatform.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepo extends CrudRepository<Restaurant,Integer> {

}
