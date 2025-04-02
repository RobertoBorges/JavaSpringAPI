package com.apidemo.sample.service;

import com.apidemo.sample.model.Customer;
import com.apidemo.sample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public Customer updateCustomer(Long id, Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            return customerRepository.save(customer);
        }
        return null;
    }
    
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
