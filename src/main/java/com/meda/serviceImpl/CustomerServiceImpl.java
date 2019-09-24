package com.meda.serviceImpl;

import com.meda.dao.CustomerDao;
import com.meda.daoImpl.CustomerDaoImpl;
import com.meda.domain.Customer;
import com.meda.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = new CustomerDaoImpl();

    public CustomerServiceImpl(CustomerDao customerDao){
        this.customerDao=customerDao;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerDao.createCustomer(customer);

    }

    @Override
    public Optional<Customer> read(Long id) {
        Optional<Customer> optional=customerDao.read(id);
        if(!optional.isPresent()){
            throw new RuntimeException("Customer is not present");
        }
        return customerDao.read(id);

    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomers();
    }
}
