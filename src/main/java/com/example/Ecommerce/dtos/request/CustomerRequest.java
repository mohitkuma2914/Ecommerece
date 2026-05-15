package com.example.Ecommerce.dtos.request;

import com.example.Ecommerce.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerRequest {
    private String name;
    private String address;
    private String age;
    private String email;
    private long mobNo;
    private Gender gender;

}
