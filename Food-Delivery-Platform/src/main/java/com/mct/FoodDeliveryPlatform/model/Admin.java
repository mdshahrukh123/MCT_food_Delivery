package com.mct.FoodDeliveryPlatform.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String userName;
    private String password;
    @NotNull
    private String mobile;

    @OneToOne
    private Food food;

    @OneToOne
    private Restaurant restaurant;
}
