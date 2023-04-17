package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Invoice;
import com.alialsubhi.demoProject1.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Invoice")
public class InvoiceController {
@Autowired
InvoiceService invoiceService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }
}
