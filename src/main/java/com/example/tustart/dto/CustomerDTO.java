package com.example.tustart.dto;

import lombok.Data;

@Data
public class CustomerDTO  implements BaseDTO{

    private Long id;

    private String customerName;

    private String contactName;

    private String address;

    private String city;

    private Integer postalCode;

    private String country;
}
