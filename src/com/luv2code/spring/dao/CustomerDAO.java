package com.luv2code.spring.dao;

import com.luv2code.spring.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    public void addCustomer(Customer customer);
}
