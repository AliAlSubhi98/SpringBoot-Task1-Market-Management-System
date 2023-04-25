package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    @Query("SELECT c FROM Customer c WHERE c.email LIKE %:email%")
    List<Customer> findByEmailContaining(@Param("email") String email);
}
