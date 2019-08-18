package com.luv2code.spring.Service;

import com.luv2code.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();
    public void addCustomer(Customer customer);

}
