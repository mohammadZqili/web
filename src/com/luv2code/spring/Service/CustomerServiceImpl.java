package com.luv2code.spring.Service;

import com.luv2code.spring.dao.CustomerDAO;
import com.luv2code.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        //delegate DAO calls

        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void addCustomer(Customer customer){
        customerDAO.addCustomer(customer);
        return;
    }
}
