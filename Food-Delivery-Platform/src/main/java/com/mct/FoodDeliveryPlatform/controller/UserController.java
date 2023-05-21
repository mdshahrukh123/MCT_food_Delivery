package com.mct.FoodDeliveryPlatform.controller;

import com.mct.FoodDeliveryPlatform.model.Users;
import com.mct.FoodDeliveryPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public String postUsers(@RequestBody List<Users> user){
        return userService.addUsers(user);
    }

    @GetMapping(value = "/getUser")
    public Iterable<Users> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping(value = "/user/id/{userId}")
    public Optional getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }


    @DeleteMapping(value = "/user/remove/id/{userId}")
    public String removeUserById(@PathVariable Integer userId){
        return userService.removeUserById(userId);
    }
}
