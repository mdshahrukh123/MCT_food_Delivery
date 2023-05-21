package com.mct.FoodDeliveryPlatform.Repository;

import com.mct.FoodDeliveryPlatform.model.Food;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends CrudRepository<Food,Integer> {
    @Query(value = "select * from Food where id = :id", nativeQuery = true)
    Food findFoodById(Integer id);


}
