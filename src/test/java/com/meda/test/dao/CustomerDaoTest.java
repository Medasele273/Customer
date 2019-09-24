package com.meda.test.dao;

import com.meda.dao.CustomerDao;
import com.meda.daoImpl.CustomerDaoImpl;
import com.meda.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class CustomerDaoTest {
    @Test
    public  void createCustomerTest(){
        CustomerDao customers= new CustomerDaoImpl();
        Customer customer1 = Customer.builder().withId(1l).withFirstName("Meda").withLastName("Wel").build();
        Customer customer2 = Customer.builder().withId(2l).withFirstName("AAA").withLastName("BBB").build();

        customers.createCustomer(customer1);
        customers.createCustomer(customer2);
        Assert.assertEquals(2,customers.findAllCustomers().size());

        Optional<Customer> optional=customers.read(3l);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        else{
            System.out.println("sorry");
        }


        List<Customer> customerList = customers.findAllCustomers();
        System.out.println(customerList);

    }
}
