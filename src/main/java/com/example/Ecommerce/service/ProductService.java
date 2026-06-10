package com.example.Ecommerce.service;

import com.example.Ecommerce.Exception.SellerNotFoundException;
import com.example.Ecommerce.converter.ProductConverters;
import com.example.Ecommerce.dtos.request.ProductRequest;
import com.example.Ecommerce.dtos.response.ProductResponse;
import com.example.Ecommerce.models.Product;
import com.example.Ecommerce.models.Seller;
import com.example.Ecommerce.repository.ProductRepository;
import com.example.Ecommerce.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    ProductRepository productRepository;
    public ProductResponse addProduct(ProductRequest productRequest, int sellerId) {
        Optional<Seller> optionalSeller =sellerRepository.findById(sellerId);
        if(optionalSeller.isEmpty()){
            throw new SellerNotFoundException("Invalid seller");
        }
        Seller seller=optionalSeller.get();
        Product product= ProductConverters.productRequestToproduct(productRequest);
        product.setSeller(seller);
        seller.getProducts().add(product);
        Product saveProduct=productRepository.save(product);
        return ProductConverters.productToProductResponse(product);


    }
}
