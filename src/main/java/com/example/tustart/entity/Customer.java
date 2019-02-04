package com.example.tustart.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String contactName;

    private String address;

    private String city;

    private Integer postalCode;

    private String country;

}
