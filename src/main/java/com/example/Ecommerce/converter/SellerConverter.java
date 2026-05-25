package com.example.Ecommerce.converter;

import com.example.Ecommerce.dtos.request.SellerRequest;
import com.example.Ecommerce.dtos.response.SellerResponse;
import com.example.Ecommerce.models.Seller;

public class SellerConverter {
    public static Seller sellerRequestToSeller(SellerRequest sellerRequest){
         return Seller.builder()
                .name(sellerRequest.getName())
                .email(sellerRequest.getEmail())
                .mobileNo(sellerRequest.getMobileNo())
                .address(sellerRequest.getAddress())
                .gstNo(sellerRequest.getGstNo())
                .build();

    }
    public static SellerResponse sellerToSellerResponse(Seller seller){
         return SellerResponse .builder()
                .name(seller.getName())
                 .mobileNo(seller.getMobileNo())
                .gstNo(seller.getGstNo()).build();
    }

}
