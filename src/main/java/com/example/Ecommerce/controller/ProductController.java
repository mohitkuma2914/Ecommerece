package com.example.Ecommerce.controller;

import com.example.Ecommerce.dtos.request.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")

public class ProductController {

    public ResponseEntity addProduct(@RequestBody ProductRequest productRequest , @RequestParam("sellerId") int sellerId){

    }

}
