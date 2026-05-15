package com.example.Ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
    private int price;
    private int quantity;
    @ManyToOne
    @JoinColumn(name= "seller_Id")
    private Seller seller;
    @ManyToMany(mappedBy = "products")
    List<OrderEntity> orders = new ArrayList<>();

}
