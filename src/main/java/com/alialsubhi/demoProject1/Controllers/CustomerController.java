package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    // http://localhost:8080/Customer/getAll
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllMarketsCustomers(){
        return customerService.getAllCustomers();
    }
}
