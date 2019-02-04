package com.example.tustart.service.impl;

import com.example.tustart.dto.CustomerDTO;
import com.example.tustart.entity.Customer;
import com.example.tustart.repository.CustomerRepository;
import com.example.tustart.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(CustomerDTO customerDTO) {
        Customer customer = new ModelMapper().map(customerDTO, Customer.class);
        return customerRepository.save(customer);
    }
}
