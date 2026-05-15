package com.example.Ecommerce.dtos.response;

import lombok.*;

import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {
    private String name;
    private String email;
    private Date createdAt;
}
