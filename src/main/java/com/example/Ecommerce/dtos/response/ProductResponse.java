package com.example.Ecommerce.dtos.response;

import com.example.Ecommerce.models.ProductCategory;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {
    private String name;
    private int price;
}
