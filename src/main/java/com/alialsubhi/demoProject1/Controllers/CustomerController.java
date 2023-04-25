package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    // http://localhost:8080/Customer/getAll
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllMarketsCustomers() {
        return customerService.getAllCustomers();
    }
    // http://localhost:8080/Customer/getById?id=1

    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam long id) {
        return customerService.getCustomerById(id);
    }
@GetMapping(value = "getWithLastName")
    public List<Customer> getCustomersWithLastName() {
        return customerService.getCustomersWithLastName();
    }
    @GetMapping(value = "getWithEmail")
    public List<Customer> getCustomersWithEmailContainingExampleAtGmailDotCom(String email) {
        email="nidhal@gmail";
        return customerService.getCustomersWithEmailContainingExampleAtGmailDotCom(email);
    }
    @GetMapping(value = "getByAgeGreaterThan/{age}")
    public List<Customer> findByAgeGreaterThan(@PathVariable int age){
        return customerService.findByAgeGreaterThan(age);
    }//http://localhost:8080/Customer/getByAgeGreaterThan/1
@GetMapping(value = "getByFullName/{firstName}/{lastName}")
    public List<Customer> findByFullName(@PathVariable String firstName, @PathVariable String lastName){
        return customerService.findByFullName(firstName,lastName);
    }//http://localhost:8080/Customer/getByFullName/ali/alsubhi

}
