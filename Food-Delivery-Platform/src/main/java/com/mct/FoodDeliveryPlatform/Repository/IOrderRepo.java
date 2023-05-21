package com.mct.FoodDeliveryPlatform.Repository;

import com.mct.FoodDeliveryPlatform.model.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Orders,Integer> {
    @Query(value = "select * from Orders where id = :id", nativeQuery = true)
    Orders findOrderById(Integer id);
}
