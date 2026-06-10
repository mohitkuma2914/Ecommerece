package com.example.Ecommerce.dtos.request;

import com.example.Ecommerce.models.Gender;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CustomerRequest {
    private String name;
    private String address;
    private String age;
    private String email;
    private long mobNo;
    private Gender gender;

}
