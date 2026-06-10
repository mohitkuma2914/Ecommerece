package com.example.Ecommerce.converter;

import com.example.Ecommerce.dtos.request.ProductRequest;
import com.example.Ecommerce.dtos.response.ProductResponse;
import com.example.Ecommerce.models.Product;

public class ProductConverters {
    public static Product productRequestToproduct(ProductRequest productRequest){
        return Product.builder().name(productRequest.getName())
                .productCategory(productRequest.getProductCategory())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();

    }
    public static ProductResponse productToProductResponse(Product product){
        return ProductResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

}
