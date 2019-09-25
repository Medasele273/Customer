package com.meda.dao;

import com.meda.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerHibernateDao {

    void saveCustomer(Customer customer);

    Optional<Customer> findCustomerWithId(Long id);

    List<Customer> findAllListCustomer();

    void deleteCustomer(String firstName);
}
