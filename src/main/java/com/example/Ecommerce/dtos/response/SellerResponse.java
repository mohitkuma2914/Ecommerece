package com.example.Ecommerce.dtos.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SellerResponse {
    private String name;
    private long mobileNo;
    private int gstNo;
}
