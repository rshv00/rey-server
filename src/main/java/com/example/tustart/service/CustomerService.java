package com.example.tustart.service;


import com.example.tustart.dto.CustomerDTO;
import com.example.tustart.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer addCustomer(CustomerDTO customerDTO);
}
