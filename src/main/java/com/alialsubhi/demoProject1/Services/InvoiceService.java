package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Models.Invoice;
import com.alialsubhi.demoProject1.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
@Autowired
InvoiceRepository invoiceRepository;


    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(long id) {
        return invoiceRepository.findById(id).get();
    }
}
