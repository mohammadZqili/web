package com.luv2code.spring.controller;


import com.luv2code.spring.Service.CustomerService;
import com.luv2code.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //need to inject Customer service
    @Autowired
    private CustomerService customerService;


    @GetMapping("/list")
    public String listCustomers(Model theModel){
        //get customers
        List<Customer> customers = customerService.getCustomers();

        //add Cosutmers to model
        theModel.addAttribute("customers",customers);

        return "list-customers";
    }


    @GetMapping("/add")
    public String showForm(Model theModel){
        //create customer object
        Customer customer = new Customer();

        //create model attribute to bind form data
        theModel.addAttribute("customer",customer);

        return "add_customer_form";
    }

    @PostMapping("/saveCustomer")
    public String saveForm(@ModelAttribute("customer") Customer customer){
        //save customer to database
        customerService.addCustomer(customer);

        return "redirect:/customer/list";
    }


}
