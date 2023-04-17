package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
