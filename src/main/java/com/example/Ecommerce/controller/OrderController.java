package com.example.Ecommerce.controller;

import com.example.Ecommerce.Exception.CusTomerNotFoundException;
import com.example.Ecommerce.Exception.ProductNotFoundException;
import com.example.Ecommerce.dto.request.OrderRequest;
import com.example.Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity placeOrder(@RequestParam int customerId,
                                     @RequestBody List<OrderRequest> orderRequests) {
        try{
            String response = orderService.placeOrder(customerId,orderRequests);
            return new ResponseEntity(response,HttpStatus.CREATED);
        }
        catch (CusTomerNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch (ProductNotFoundException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    // find all the orders who have a totalvalue greater than input value
}