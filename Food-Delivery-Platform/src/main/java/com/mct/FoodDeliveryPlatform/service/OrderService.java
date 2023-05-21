package com.mct.FoodDeliveryPlatform.service;

import com.mct.FoodDeliveryPlatform.Repository.IOrderRepo;
import com.mct.FoodDeliveryPlatform.model.Orders;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public String orderPlaced(List<Orders> order) {
        Iterable<Orders> statusOrder = orderRepo.saveAll(order);

        if(statusOrder != null){
            return "Order Placed Successfully....!!!!!!!";
        }
        else{
            return "Order not placed ...failed...!!!!!!!";
        }
    }

    public Iterable<Orders> getAllOrder() {
        return orderRepo.findAll();
    }
    @Transactional
    public Orders getOrderById(Integer id) {
        return orderRepo.findOrderById(id);
    }



    public String removeOrderById(Integer id) {
         orderRepo.deleteById(id);
         return "Deleted Successfully >>!!!!!";
    }
}
