package com.examenfiltro.examenfiltro.customer.infrastructure.in;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfiltro.examenfiltro.customer.app.service.CustomerService;
import com.examenfiltro.examenfiltro.customer.domain.entities.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class customerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(Long id) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return Optional.empty();
        }
        return foundCustomer;
    }
    
    @PostMapping
    public Customer createCustomer(Customer customer) {
        customerService.save(customer);
        return customer;
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(Long id, Customer customer) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return customer;
        }
        customer.setId(id);
        customerService.save(customer);
        return customer;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(Long id) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return;
        }
        customerService.disableForeignKeyChecks();
        customerService.delete(id);
        customerService.enableForeignKeyChecks();
    }
}
