package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(long id) {
        return customerRepository.findById(id).get();
    }

    public List<Customer> getCustomersWithLastName() {
        return customerRepository.findByLastName("ali");
    }

    public List<Customer> getCustomersWithEmailContainingExampleAtGmailDotCom(String email) {
        return customerRepository.findByEmailContaining(email);
    }

    public List<Customer> findByAgeGreaterThan(int age){
        return customerRepository.findByAgeGreaterThan(age);
    }
}
