package com.meda.daoImpl;

import com.meda.dao.CustomerHibernateDao;
import com.meda.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class CustomerHibernateDaoImpl implements CustomerHibernateDao {

     private SessionFactory sessionFactory;
     public CustomerHibernateDaoImpl(SessionFactory sessionFactory){
         this.sessionFactory=sessionFactory;
     }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        session.persist(customer);
        session.close();

    }

    @Override
    public Optional<Customer> findCustomerWithId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAllListCustomer() {
        return null;
    }

    @Override
    public void deleteCustomer(String firstName) {

    }
}
