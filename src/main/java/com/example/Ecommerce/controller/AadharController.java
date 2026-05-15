package com.example.Ecommerce.controller;

import com.example.Ecommerce.Exception.CusTomerNotFoundException;
import com.example.Ecommerce.dtos.response.AadharResponse;
import com.example.Ecommerce.service.AadharService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AadharController {
    AadharService aadharService;
    @PostMapping
    public ResponseEntity addAadhar(@RequestParam("aadhar-no") String aadharNo,
                                    @RequestParam("customer-id") int customerId) {
        try {
            AadharResponse response = aadharService.addAadhar(aadharNo, customerId);
            return new ResponseEntity(response, HttpStatus.CREATED);
        } catch (CusTomerNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
