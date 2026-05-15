package com.example.Ecommerce.service;

import com.example.Ecommerce.Exception.CusTomerNotFoundException;
import com.example.Ecommerce.converter.AadharConvertor;
import com.example.Ecommerce.dtos.response.AadharResponse;
import com.example.Ecommerce.models.Aadhar;
import com.example.Ecommerce.models.Customer;
import com.example.Ecommerce.repository.AadharRepository;
import com.example.Ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AadharService {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    AadharRepository aadharRepo;

    public AadharResponse addAadhar(String aadharNo,
                                    int customerId) {
        Optional<Customer> customerOptional = customerRepo.findById(customerId);
        if(customerOptional.isEmpty()) {
            throw new CusTomerNotFoundException("Invalid customer id: "+customerId);
        }

        Customer customer = customerOptional.get();

        Aadhar aadhar = Aadhar.builder()
                .aadharNo(aadharNo)
                .customer(customer)
                .build();

        Aadhar savedAadhar = aadharRepo.save(aadhar);

        return AadharConvertor.aadharToAadharResponse(savedAadhar);

    }
}