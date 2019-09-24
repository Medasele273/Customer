package com.meda.dao;

import com.meda.domain.Customer;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    void createCustomer(Customer customer);

    Optional<Customer> read(Long id);

    List<Customer> findAllCustomers();
}
