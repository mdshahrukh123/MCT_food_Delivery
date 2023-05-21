package com.mct.FoodDeliveryPlatform.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @NotNull
    private String userName;
    private String gender;
    private Integer age;
    @NotNull
    private String mobile;
    @Email
    private String email;
    @NotNull
    private String street;
    private String locality;
    @NotNull
    private String district;
    @NotEmpty
    private String state;
    @NotNull
    private Integer pin;

    @OneToOne
     private Orders order;
}
