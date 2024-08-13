package com.examenfiltro.examenfiltro.customer.infrastructure.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfiltro.examenfiltro.customer.app.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class customerController {
    @Autowired
    CustomerService CustomerService;

    
}
