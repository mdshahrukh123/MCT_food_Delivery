package com.mct.FoodDeliveryPlatform.controller;

import com.mct.FoodDeliveryPlatform.model.Orders;
import com.mct.FoodDeliveryPlatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping
    public String OrderPlace(@RequestBody List<Orders> order){
        return orderService.orderPlaced(order);
    }

    @GetMapping(value = "/order/show")
    public Iterable<Orders> showAllOrder(){
        return  orderService.getAllOrder();
    }

    @GetMapping(value = "/order/id/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }


    @DeleteMapping(value = "/order/remove/id/{id}")
    public String removeOrderById(@PathVariable Integer id){
        return orderService.removeOrderById(id);
    }
}
