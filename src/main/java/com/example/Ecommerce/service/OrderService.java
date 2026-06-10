package com.example.Ecommerce.service;

import com.example.Ecommerce.Exception.CusTomerNotFoundException;
import com.example.Ecommerce.Exception.ProductNotFoundException;
import com.example.Ecommerce.dto.request.OrderRequest;


import com.example.Ecommerce.models.Customer;
import com.example.Ecommerce.models.OrderEntity;
import com.example.Ecommerce.models.Product;
import com.example.Ecommerce.models.Customer;


import com.example.Ecommerce.repository.CustomerRepository;

import com.example.Ecommerce.repository.OrderRepository;

import com.example.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.example.Ecommerce.models.Product;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class OrderService {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    ProductRepository productRepo;

    @Autowired
    OrderRepository orderRepo;

    @PostMapping
    public String placeOrder(int customerId,
                             List<OrderRequest> orderRequests) {
        Optional<com.example.Ecommerce.models.Customer> customerOptional = customerRepo.findById(customerId);
        if (customerOptional.isEmpty()) {
            throw new CusTomerNotFoundException("Invalid customer id: " + customerId);
        }

        Customer customer = customerOptional.get();

        // product ids;
        List<Product> products = new ArrayList<>();
        int totalValue = 0;
        for (OrderRequest orderRequest: orderRequests) {
            Optional<Product> productOptional = productRepo.findById(orderRequest.getProductId());
            if (productOptional.isEmpty()) {
                throw new ProductNotFoundException("Invalid productId: " + orderRequest.getProductId());
            }
            Product product = productOptional.get();
            if (product.getQuantity() < orderRequest.getQuantity()) {
                throw new ProductNotFoundException("Product out of stock with id: " + orderRequest.getProductId());
            }
            products.add(product);
            totalValue += product.getPrice()*orderRequest.getQuantity();
        }

        OrderEntity order = new OrderEntity();
        order.setTotalValue(totalValue);
        order.setCustomer(customer);
        order.setProducts(products);

        OrderEntity savedOrder = orderRepo.save(order);

        // decrease the quantity of products if order placed sucesfully

        // order response
        // total value
        // name , quantity

        return "Order placed successfully";
    }
}