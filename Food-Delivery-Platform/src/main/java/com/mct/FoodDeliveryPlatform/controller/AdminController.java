package com.mct.FoodDeliveryPlatform.controller;

import com.mct.FoodDeliveryPlatform.model.Admin;
import com.mct.FoodDeliveryPlatform.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping
    public String createAdmin(@RequestBody List<Admin> admin){
        return adminService.createAdmin(admin);
    }

    @GetMapping(value = "/admin/show")
    public Iterable<Admin> showAllAdmin(){
        return adminService.findAdmin();
    }

    @GetMapping(value = "/admin/id/{id}")
    public Admin showAdminById(@PathVariable Integer id){
        return adminService.showAdminById(id);
    }

    @DeleteMapping(value = "/admin/id/{id}")
    public String removeAdminById(@PathVariable Integer id){
        return adminService.removeAdmin(id);
    }
}
