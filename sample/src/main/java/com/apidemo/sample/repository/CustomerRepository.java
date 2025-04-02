package com.apidemo.sample.repository;

import com.apidemo.sample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Spring Data JPA will implement basic CRUD operations automatically
}
