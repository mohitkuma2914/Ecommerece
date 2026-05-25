package com.example.Ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long mobileNo;
    private String address;
    private String email;
    private int gstNo;
    @OneToMany(mappedBy = "seller")
    List<Product> products=new ArrayList<>();
}
