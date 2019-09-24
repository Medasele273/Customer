package com.meda.test.domain;

import com.meda.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void test(){
        Customer customer1 = Customer.builder().withId(1l).withFirstName("Meda").withLastName("Wel").build();
        Customer customer2 = Customer.builder().withId(2l).withFirstName("AAA").withLastName("BBB").build();

        Assert.assertTrue("Should be True",customer1.getFirstName().endsWith("Meda"));

        Assert.assertEquals("AAA",customer2.getFirstName());

        System.out.println(customer1);
    }
}
