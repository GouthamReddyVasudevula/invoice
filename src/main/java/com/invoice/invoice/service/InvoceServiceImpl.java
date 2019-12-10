package com.invoice.invoice.service;

import com.invoice.invoice.model.Invoice;
import com.invoice.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoceServiceImpl implements IinvoiceService{

    @Autowired
    private InvoiceRepository invoiceRepo;


    @Override
    public String save(Invoice invoice) {

        invoiceRepo.save(invoice);

        return "invoice created successfully";
    }
}
