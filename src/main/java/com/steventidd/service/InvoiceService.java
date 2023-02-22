package com.steventidd.service;

import com.steventidd.model.Invoice;
import com.steventidd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class InvoiceService {

    private UserService userService;

    public InvoiceService (UserService userService) {
        this.userService = userService;
    }

    private List<Invoice> invoices = new CopyOnWriteArrayList<>();
    public List<Invoice> findAll() {
        return invoices;
    }
    public Invoice create(String userId, Integer amount) {

        User user = userService.findById(userId);
        if (user == null) {
            throw new IllegalStateException();
        }


        // TODO real pdf creation and storing it on network server
        Invoice invoice = new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
        invoices.add(invoice);
        return invoice;
    }


}
