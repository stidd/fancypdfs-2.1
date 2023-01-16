package com.steventidd.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.steventidd.model.User;
import com.steventidd.service.InvoiceService;
import com.steventidd.service.UserService;

public class Application {

    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();


}
