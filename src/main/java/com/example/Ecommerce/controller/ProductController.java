package com.example.Ecommerce.controller;

import com.example.Ecommerce.dtos.request.ProductRequest;
import com.example.Ecommerce.dtos.response.ProductResponse;
import com.example.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")

public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping
    public ResponseEntity addProduct(@RequestBody ProductRequest productRequest , @RequestParam("sellerId") int sellerId){
        ProductResponse response=productService.addProduct(productRequest,sellerId);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
