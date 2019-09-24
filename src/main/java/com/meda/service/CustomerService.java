package com.meda.service;

import com.meda.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    void createCustomer(Customer customer);
    Optional<Customer> read(Long id);
    List<Customer> findAllCustomer();
}
