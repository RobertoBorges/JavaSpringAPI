package com.apidemo.sample.controller;

import com.apidemo.sample.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    
    @GetMapping
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        
        // Add some sample customers
        customers.add(new Customer(1L, "John Doe", "john.doe@example.com", "555-123-4567"));
        customers.add(new Customer(2L, "Jane Smith", "jane.smith@example.com", "555-765-4321"));
        customers.add(new Customer(3L, "Bob Johnson", "bob.johnson@example.com", "555-987-6543"));
        
        return customers;
    }
}
