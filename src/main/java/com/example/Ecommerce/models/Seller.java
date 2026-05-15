package com.example.Ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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
}
