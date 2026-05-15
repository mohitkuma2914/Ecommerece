package com.example.Ecommerce.service;

import com.example.Ecommerce.converter.CustomerConverter;
import com.example.Ecommerce.dtos.request.CustomerRequest;
import com.example.Ecommerce.dtos.response.CustomerResponse;
import com.example.Ecommerce.models.Customer;
import com.example.Ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer= CustomerConverter.customerRequestToCustomer(customerRequest);
        Customer saverdCustomer=customerRepository.save(customer);
        return CustomerConverter.customerToCustomerResponse(saverdCustomer);


    }

    public CustomerResponse getCustomerById(int id) {
        Optional<Customer> optionalCustomer=customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new RuntimeException("Invalid customer id");
        }
        Customer customer =optionalCustomer.get();
        return  CustomerConverter.customerToCustomerResponse(customer);
    }

    public List<Customer> getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }

    public List<Customer> findAllByGenderAndAge(String gender, int age) {
        return customerRepository.getAllByGenderAndAgeGreaterThan(gender,age);
    }
}
