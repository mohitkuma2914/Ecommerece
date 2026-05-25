package com.example.Ecommerce.controller;

import com.example.Ecommerce.dtos.request.CustomerRequest;
import com.example.Ecommerce.dtos.response.CustomerResponse;
import com.example.Ecommerce.models.Customer;
import com.example.Ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){
        CustomerResponse response=customerService.addCustomer(customerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity getCustomerById(@RequestParam int id) {
        CustomerResponse response= customerService.getCustomerById(id);
        return new ResponseEntity(response,HttpStatus.OK);

    }
    @GetMapping("name/{name}")
    public ResponseEntity getCustomerByName(@PathVariable ("name") String name){
        List<Customer> response=customerService.getCustomerByName(name);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }
    @GetMapping("/gender/{gender}/age/{age}")
    public ResponseEntity findAllByGenderAndAge(@PathVariable("gender") String gender,
                                                @PathVariable("age") int age) {
        List<Customer> customers = customerService.findAllByGenderAndAge(gender,age);
        return new ResponseEntity(customers,HttpStatus.OK);
    }

}
