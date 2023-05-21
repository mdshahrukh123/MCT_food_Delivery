package com.mct.FoodDeliveryPlatform.service;

import com.mct.FoodDeliveryPlatform.Repository.IAdminRepo;
import com.mct.FoodDeliveryPlatform.model.Admin;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    IAdminRepo adminRepo;
    public String createAdmin(List<Admin> admin) {
        Iterable<Admin> statusAdmin = adminRepo.saveAll(admin);
        if(statusAdmin != null){
            return "Admin Successful created.....!!!!!!!!!";
        }else{
            return "Failed...admin not created .....!!!!";
        }
    }

    public Iterable<Admin> findAdmin() {
        return adminRepo.findAll();
    }
    @Transactional
    public Admin showAdminById(Integer id) {
        return adminRepo.findAdminById(id);
    }

    public String removeAdmin(Integer id) {
        adminRepo.deleteById(id);

        return "Deleted Successfully ...!!!!1";
    }
}
