package com.example.tustart.model;

import lombok.Data;

@Data
public class Product {
    private Long id;

    private String productName;

    private Double productPrice;

    private String productColor;

    private String productDescription;

    private String otherProductDetails;

}
