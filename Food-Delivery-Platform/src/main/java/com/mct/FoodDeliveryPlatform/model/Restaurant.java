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
public class Restaurant {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer resId;
    @NotNull
    private String name;
    private FoodType foodType;
    private String locality;
}
