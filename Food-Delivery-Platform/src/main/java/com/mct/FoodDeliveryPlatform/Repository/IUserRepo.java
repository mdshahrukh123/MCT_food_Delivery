package com.mct.FoodDeliveryPlatform.Repository;

import com.mct.FoodDeliveryPlatform.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<Users,Integer> {

}
