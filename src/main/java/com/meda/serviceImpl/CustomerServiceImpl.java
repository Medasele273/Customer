package com.meda.serviceImpl;

import com.meda.dao.CustomerDao;
import com.meda.dao.CustomerHibernateDao;
import com.meda.daoImpl.CustomerDaoImpl;
import com.meda.domain.Customer;
import com.meda.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao ;

    private CustomerHibernateDao customerHibernateDao;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerHibernateDao customerHibernateDao){
        this.customerHibernateDao=customerHibernateDao;
    }

    public void setCustomerDao(CustomerDao customerDao){
        this.customerDao=customerDao;

    }

    @Override
    public void createCustomer(Customer customer) {
        customerHibernateDao.saveCustomer(customer);

    }

    @Override
    public Optional<Customer> read(Long id) {
        Optional<Customer> optional=customerHibernateDao.findCustomerWithId(id);
        if(!optional.isPresent()){
            throw new RuntimeException("Customer is not present");
        }
        return customerHibernateDao.findCustomerWithId(id);

    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerHibernateDao.findAllListCustomer();
    }
}
