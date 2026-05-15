package com.example.Ecommerce.dtos.response;

import com.example.Ecommerce.dtos.response.CustomerResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AadharResponse {

    private String aadharNo;
    private CustomerResponse customer;
}