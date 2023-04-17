package com.alialsubhi.demoProject1.Repositories;


import com.alialsubhi.demoProject1.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
