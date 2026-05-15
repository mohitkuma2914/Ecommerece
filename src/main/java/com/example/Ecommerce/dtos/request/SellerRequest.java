package com.example.Ecommerce.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequest {
    private String name;
    private long mobileNo;
    private String address;
    private String email;
    private int gstNo;
}
