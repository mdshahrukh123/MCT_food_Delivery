package com.mct.FoodDeliveryPlatform.Repository;

import com.mct.FoodDeliveryPlatform.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends CrudRepository<Admin,Integer> {
    @Query(value = "select * from Admin where id = :id", nativeQuery = true )
    Admin findAdminById(Integer id);
}
