package com.example.Ecommerce.service;

import com.example.Ecommerce.converter.SellerConverter;
import com.example.Ecommerce.dtos.request.SellerRequest;
import com.example.Ecommerce.dtos.response.SellerResponse;
import com.example.Ecommerce.models.Seller;
import com.example.Ecommerce.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
        public SellerResponse addSeller(SellerRequest sellerRequest) {
            Seller seller= SellerConverter.sellerRequestToSeller(sellerRequest);
            Seller savedSaller=sellerRepository.save(seller);
            return SellerConverter.sellerToSellerResponse(savedSaller);


    }
}
