package com.example.Ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderId;
    int totalValue;
    @CreationTimestamp
    Date placedOn;
    @ManyToOne
    @JoinColumn(name ="customerId")
    private Customer customer;
    @ManyToMany
    @JoinTable(name = "order_product")
    List<Product> products = new ArrayList<>();
}
