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
public class Orders {
       @Id
       @GeneratedValue(strategy =  GenerationType.AUTO)
       private Integer id;

       private String idRestaurant;
       @NotNull
       private OrderStatus orderStatus;

}
