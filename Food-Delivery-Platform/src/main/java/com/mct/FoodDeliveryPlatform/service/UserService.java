package com.mct.FoodDeliveryPlatform.service;

import com.mct.FoodDeliveryPlatform.Repository.IUserRepo;
import com.mct.FoodDeliveryPlatform.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String addUsers(List<Users> user) {
       Iterable<Users> statusList =  userRepo.saveAll(user);

       if(statusList != null){
           return "User created successfully.....!!!!!!";
       }else{
           return "user not create.....!!!!!!";
       }
    }

    public Iterable<Users> getUsers() {
        return userRepo.findAll();
    }

    public Optional getUserById(Integer userId) {
        return userRepo.findById(userId);
    }



    public String removeUserById(Integer userId) {
        userRepo.deleteById(userId);
        return "Deleted successfully ....!!!!";
    }
}
