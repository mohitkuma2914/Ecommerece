package com.example.Ecommerce.converter;

import com.example.Ecommerce.dtos.request.CustomerRequest;
import com.example.Ecommerce.dtos.response.CustomerResponse;
import com.example.Ecommerce.models.Customer;

public class CustomerConverter {
    public static  Customer customerRequestToCustomer(CustomerRequest customerRequest){
         return Customer.builder()
                .name(customerRequest.getName())
                 .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                . gender(customerRequest.getGender())
                .address(customerRequest.getAddress())
                .mobNo(customerRequest.getMobNo())
                .build();

    }
    public static CustomerResponse customerToCustomerResponse(Customer customer){
        return CustomerResponse.builder()
        .name(customer.getName())
                .age(customer.getAge())
                .email(customer.getEmail())
                        .createdAt(customer.getCreatedAt())
                .build();
    }
}
