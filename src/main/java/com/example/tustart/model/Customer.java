package com.example.tustart.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String login;

    private String password;

    private String phoneNumber;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String addressLine4;

    private String city;

    private String country;
}
