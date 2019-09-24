package com.meda.daoImpl;

import com.meda.dao.CustomerDao;
import com.meda.domain.Customer;

import java.nio.file.AccessDeniedException;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerDaoImpl implements CustomerDao {

    Map<Long,Customer> customers = new HashMap<>();

    @Override
    public void createCustomer(Customer customer)  {
        if(customers.containsKey(customer.getId())){
            throw new RuntimeException("Customer with " +customer.getId()+ " is present");
        }
        customers.put(customer.getId(),customer);

    }

    @Override
    public Optional<Customer> read(Long id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customers.values().stream().map(c ->Customer.builder()
                       .withId(c.getId()).withFirstName(c.getFirstName())
                       .withLastName(c.getLastName()).build()).collect(Collectors.toList());
    }
}
