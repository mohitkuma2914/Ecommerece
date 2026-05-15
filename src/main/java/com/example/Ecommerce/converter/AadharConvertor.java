package com.example.Ecommerce.converter;


import com.example.Ecommerce.dtos.response.AadharResponse;
import com.example.Ecommerce.models.Aadhar;

public class AadharConvertor {


    public static AadharResponse aadharToAadharResponse(Aadhar aadhar) {
        return AadharResponse.builder()
                .aadharNo(aadhar.getAadharNo())
                .customer(CustomerConverter.customerToCustomerResponse(aadhar.getCustomer()))
                .build();
    }
}