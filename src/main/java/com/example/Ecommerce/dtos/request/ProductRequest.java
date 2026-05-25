package com.example.Ecommerce.dtos.request;

import com.example.Ecommerce.models.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private ProductCategory productCategory;
    private int price;
    private int quantity;
}
