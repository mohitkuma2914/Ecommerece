package com.example.Ecommerce.controller;

import com.example.Ecommerce.dtos.request.SellerRequest;
import com.example.Ecommerce.dtos.response.SellerResponse;
import com.example.Ecommerce.models.Seller;
import com.example.Ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;
    @PostMapping
    public SellerResponse addSeller(@RequestBody SellerRequest sellerRequest){
        SellerResponse sellerResponse=sellerService.addSeller(sellerRequest);
        return  sellerResponse;

    }

}
