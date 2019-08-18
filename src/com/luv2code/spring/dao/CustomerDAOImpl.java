package com.luv2code.spring.dao;

import com.luv2code.spring.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public class CustomerDAOImpl implements CustomerDAO {


    //need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;




    @Override
    public List<Customer> getCustomers() {

        //GET THE HIBERNATE CURRENTSESSION
        Session currentSession = sessionFactory.getCurrentSession();

        //Create Query
        Query<Customer> theQuery = currentSession.createQuery("from Customer",Customer.class);

        //Execute Query
        List<Customer> customers = theQuery.getResultList();

        //return the results

        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        //get current session
        Session session = sessionFactory.getCurrentSession();

        //save customer to database
        session.save(customer);

    }
}
