package com.example.Ecommerce.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String name;
    private String address;
    @Column(nullable = false)
    private  long mobNo;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @CreationTimestamp
    private Date createdAt;

}
