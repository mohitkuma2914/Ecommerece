package com.example.Ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aadhar {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adharId;
        @Column(unique = true)
    private String aadharNo;
        @OneToOne
        @JoinColumn(name="customer_Id")
    private Customer customer;
}
